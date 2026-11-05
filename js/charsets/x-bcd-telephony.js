(function(require,window){
const c = window || require('../charsets');
const d = c.CharsetDecoder.register;
const e = c.CharsetEncoder.register;
d("x-bcd-telephony",[],1,{nextState:{},output:{0:{0:[48],1:[49],2:[50],3:[51],4:[52],5:[53],6:[54],7:[55],8:[56],9:[57],10:[42],11:[35],12:[65],13:[66],14:[67],15:[32]}}});
e("x-bcd-telephony",[],1,{replacement:[10],nextState:{},output:{0:{32:[15],35:[11],42:[10],48:[0],49:[1],50:[2],51:[3],52:[4],53:[5],54:[6],55:[7],56:[8],57:[9],65:[12],66:[13],67:[14],97:[12],98:[13],99:[14]}}});
})(((typeof require === 'function') ? require : null), ((typeof window === 'object') ? window : null));