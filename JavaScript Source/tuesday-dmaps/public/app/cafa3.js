/**
 * @author: Donggeon Oh
 * @Date: 2016-11-15
 *
 */

var item = function (dv) {
    dv.margin("1%").paddingTop('1%').paddingBottom('1%').borderRadius('10px');
};

div().append().margin("1%").paddingTop('3%').paddingBottom('3%').bgColor('#8fffd4').textAlign('center').fontSize('8em').fontFamily('impact').text("Hello! This is My page").borderRadius('20px').displayBlock();
div().append().deco(item).bgColor('#ff8b8b').float('left').width('48%').textAlign('center').fontSize('4em').fontFamily('georgia').text("Notice");
div().append().deco(item).bgColor('#ffb2b2').float('right').width('48%').textAlignCenter().fontSize('4em').fontFamily('georgia').text("Instruction");
div().append().deco(item).bgColor('#cccccc').float('left').width('48%').textAlign('center').fontSize('4em').fontFamily('georgia').text("Contact");
div().append().deco(item).bgColor('#aaaaaa').float('right').width('48%').textAlign('center').fontSize('4em').fontFamily('georgia').text("More...");