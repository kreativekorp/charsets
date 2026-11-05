(function(require,window){
const c = window || require('../charsets');
const d = c.CharsetDecoder.register;
const e = c.CharsetEncoder.register;
d("x-bcd-hexadecimal",[],1,{nextState:{},output:{0:{0:[48],1:[49],2:[50],3:[51],4:[52],5:[53],6:[54],7:[55],8:[56],9:[57],10:[65],11:[66],12:[67],13:[68],14:[69],15:[70]}}});
e("x-bcd-hexadecimal",[],1,{replacement:[0],nextState:{},output:{0:{48:[0],49:[1],50:[2],51:[3],52:[4],53:[5],54:[6],55:[7],56:[8],57:[9],65:[10],66:[11],67:[12],68:[13],69:[14],70:[15],97:[10],98:[11],99:[12],100:[13],101:[14],102:[15]}}});
})(((typeof require === 'function') ? require : null), ((typeof window === 'object') ? window : null));