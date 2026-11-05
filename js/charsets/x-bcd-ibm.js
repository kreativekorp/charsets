(function(require,window){
const c = window || require('../charsets');
const d = c.CharsetDecoder.register;
const e = c.CharsetEncoder.register;
d("x-bcd-ibm",["x-bcd"],1,{nextState:{},output:{0:{0:[48],1:[49],2:[50],3:[51],4:[52],5:[53],6:[54],7:[55],8:[56],9:[57],10:[43],11:[45],12:[43],13:[45],14:[43],15:[32]}}});
e("x-bcd-ibm",["x-bcd"],1,{replacement:[15],nextState:{},output:{0:{32:[15],43:[12],45:[13],48:[0],49:[1],50:[2],51:[3],52:[4],53:[5],54:[6],55:[7],56:[8],57:[9]}}});
})(((typeof require === 'function') ? require : null), ((typeof window === 'object') ? window : null));