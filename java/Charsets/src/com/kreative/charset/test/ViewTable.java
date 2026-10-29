package com.kreative.charset.test;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ViewTable {
	private static final Pattern BYTES_TO_CHARS = Pattern.compile("^0x(([0-9A-F]{2})+)\\s+U((\\+([1-9A-F]|10)?[0-9A-F]{4})+)$");
	private static final Pattern CHARS_TO_BYTES = Pattern.compile("^U((\\+([1-9A-F]|10)?[0-9A-F]{4})+)\\s+0x(([0-9A-F]{2})+)$");
	
	private static byte[] hexToBytes(String hex) {
		byte[] b = new byte[hex.length() / 2];
		for (int i = 0; i < hex.length(); i += 2) {
			String bs = hex.substring(i, i+2);
			int bi = Integer.parseInt(bs, 16);
			b[i / 2] = (byte)bi;
		}
		return b;
	}
	
	private static String hexToChars(String hex) {
		StringBuffer s = new StringBuffer();
		for (String cs : hex.split("[+]")) {
			int ci = Integer.parseInt(cs, 16);
			s.append(Character.toChars(ci));
		}
		return s.toString();
	}
	
	private static String charsToHex(String chars) {
		StringBuffer s = new StringBuffer();
		int i = 0; int n = chars.length();
		while (i < n) {
			if (i != 0) s.append("+");
			int ch = chars.codePointAt(i);
			String h = Integer.toHexString(ch);
			while (h.length() < 4) h = "0" + h;
			s.append(h.toUpperCase());
			i += Character.charCount(ch);
		}
		return s.toString();
	}
	
	private static class CharacterCell extends JPanel {
		private static final long serialVersionUID = 1L;
		public CharacterCell(String mapsTo, String[] mapsFrom) {
			super(new BorderLayout());
			
			JLabel glyphLabel = new JLabel((mapsTo != null) ? mapsTo : "\uFFFD");
			glyphLabel.setFont(glyphLabel.getFont().deriveFont(24f));
			glyphLabel.setHorizontalAlignment(JLabel.CENTER);
			add(glyphLabel, BorderLayout.PAGE_START);
			
			boolean roundTrips = false;
			JPanel innerCodePanel = new JPanel(new GridLayout(0,1));
			JLabel toCodeLabel = new JLabel((mapsTo != null) ? charsToHex(mapsTo) : "???");
			toCodeLabel.setFont(toCodeLabel.getFont().deriveFont(Font.BOLD));
			toCodeLabel.setHorizontalAlignment(JLabel.CENTER);
			innerCodePanel.add(toCodeLabel);
			if (mapsFrom != null) {
				for (String s : mapsFrom) {
					if (s.equals(mapsTo)) {
						roundTrips = true;
					} else {
						JLabel fromCodeLabel = new JLabel(charsToHex(s));
						fromCodeLabel.setFont(fromCodeLabel.getFont().deriveFont(Font.PLAIN));
						fromCodeLabel.setHorizontalAlignment(JLabel.CENTER);
						innerCodePanel.add(fromCodeLabel);
					}
				}
			}
			
			if (!roundTrips) {
				glyphLabel.setForeground(Color.lightGray);
				toCodeLabel.setForeground(Color.lightGray);
				for (Component c : innerCodePanel.getComponents()) {
					c.setForeground(Color.lightGray);
				}
			}
			
			JPanel outerCodePanel = new JPanel(new BorderLayout());
			outerCodePanel.add(innerCodePanel, BorderLayout.PAGE_START);
			add(outerCodePanel, BorderLayout.CENTER);
			
			setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.gray),
				BorderFactory.createEmptyBorder(2, 2, 0, 2)
			));
		}
	}
	
	private static class TablePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public TablePanel(Map<Integer,String> mapsTo, Map<Integer,List<String>> mapsFrom) {
			super(new GridLayout(16,16));
			for (int i = 0; i < 256; i++) {
				String cMapsTo = mapsTo.get(i);
				String[] cMapsFromA = new String[0];
				List<String> cMapsFromL = mapsFrom.get(i);
				if (cMapsFromL != null) cMapsFromA = cMapsFromL.toArray(cMapsFromA);
				CharacterCell c = new CharacterCell(cMapsTo, cMapsFromA);
				add(c);
			}
		}
		public static TablePanel create(File file) {
			Map<Integer,String> mapsTo = new HashMap<Integer,String>();
			Map<Integer,List<String>> mapsFrom = new HashMap<Integer,List<String>>();
			try {
				Scanner scan = new Scanner(file);
				while (scan.hasNextLine()) {
					String line = scan.nextLine();
					int o = line.indexOf('#');
					line = (o < 0) ? line.trim() : line.substring(0, o).trim();
					if (line.length() == 0) continue;
					Matcher bm = BYTES_TO_CHARS.matcher(line);
					if (bm.matches()) {
						byte[] bs = hexToBytes(bm.group(1));
						String cs = hexToChars(bm.group(3).substring(1));
						if (bs.length == 1) mapsTo.put(bs[0] & 0xFF, cs);
					}
					Matcher cm = CHARS_TO_BYTES.matcher(line);
					if (cm.matches()) {
						String cs = hexToChars(cm.group(1).substring(1));
						byte[] bs = hexToBytes(cm.group(4));
						if (bs.length == 1) {
							List<String> a = mapsFrom.get(bs[0] & 0xFF);
							if (a == null) {
								a = new ArrayList<String>();
								mapsFrom.put(bs[0] & 0xFF, a);
							}
							a.add(cs);
						}
					}
				}
				scan.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			if (mapsTo.isEmpty() && mapsFrom.isEmpty()) return null;
			return new TablePanel(mapsTo, mapsFrom);
		}
	}
	
	private static class MultiTablePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public MultiTablePanel(SortedMap<String,TablePanel> panels) {
			super(new BorderLayout());
			
			final JList list = new JList(panels.keySet().toArray(new String[0]));
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane pane = new JScrollPane(
				list,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
			);
			add(pane, BorderLayout.LINE_START);
			
			final CardLayout cl = new CardLayout();
			final JPanel tables = new JPanel(cl);
			for (Map.Entry<String,TablePanel> e : panels.entrySet()) {
				tables.add(e.getValue(), e.getKey());
			}
			JScrollPane pane2 = new JScrollPane(
				tables,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
			);
			add(pane2, BorderLayout.CENTER);
			
			list.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					Object which = list.getSelectedValue();
					if (which != null) cl.show(tables, which.toString());
				}
			});
		}
		private static void addPanels(SortedMap<String,TablePanel> panels, File file) {
			if (file.isFile()) {
				String name = file.getName();
				if (name.endsWith(".txt")) name = name.substring(0, name.length() - 4);
				TablePanel panel = TablePanel.create(file);
				if (panel != null) panels.put(name, panel);
			}
			if (file.isDirectory()) {
				for (File child : file.listFiles()) {
					String cname = child.getName();
					if (cname.startsWith(".") || cname.endsWith("\r")) continue;
					if (child.isDirectory() || cname.endsWith(".txt")) addPanels(panels, child);
				}
			}
		}
		public static MultiTablePanel create(File... files) {
			SortedMap<String,TablePanel> panels = new TreeMap<String,TablePanel>();
			for (File file : files) addPanels(panels, file);
			return new MultiTablePanel(panels);
		}
	}
	
	public static void main(String[] args) {
		final List<File> files = new ArrayList<File>();
		for (String arg : args) files.add(new File(arg));
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MultiTablePanel p = MultiTablePanel.create(files.toArray(new File[0]));
				JFrame f = new JFrame("Oh how the turn tables...");
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setContentPane(p);
				f.pack();
				f.setLocationRelativeTo(null);
				f.setVisible(true);
			}
		});
	}
}
