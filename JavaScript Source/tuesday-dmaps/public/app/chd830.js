// div().append().text('Title').size('98%""'20%').bgColor('#A0A0FF').marginUpDown('1%').textAlignCenter().fontSize(100).marginSide('1%').borderRadius(25);

// div().append().text('D').size('48%','20%').bgColor('#BAAAD7').marginUpDown('1%').textAlignCenter().fontSize(100).marginSide('1%').borderRadius(25);

var calc=new Div();
var res=new Div();

calc.append().size('44%','1%').displayBlock().bgColor('#eeeeee').padding('2%').marginLeft('5%').textAlign('right').fontSize(20).cursor('text').text('Hi').hoverFontSize();
res.append().size('44%','5%').displayBlock().bgColor('#cccccc').padding('2%').marginLeft('5%').textAlign('right').fontSize(40).cursor('text').text('Hi').hoverText();

div().append().text('CE').size('12%','6%').bgColor('#828282').marginLeft('5%').textAlignCenter().click(function(dv, e) {
    res.text('      ');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('C').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    calc.text('     ');
    res.text('      ');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('<<').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    var string=res.text().length;
    var sub=res.text().substring(0,string-1);
    res.text(sub);
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('÷').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    calc.text(calc.text()+res.text()+'÷');
    res.text('  ');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30).marginRight('39%');

div().append().text('7').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'7');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30).marginLeft('5%');

div().append().text('8').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'8');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('9').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'9');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('×').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    calc.text(calc.text()+res.text()+'×');
    res.text('  ');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30).marginRight('39%');

div().append().text('4').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'4');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30).marginLeft('5%');

div().append().text('5').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'5');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('6').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'6');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('-').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    calc.text(calc.text()+res.text()+' -');
    res.text('  ');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30).marginRight('39%');

div().append().text('1 ').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'1');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30).marginLeft('5%');

div().append().text('2').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'2');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('3').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'3');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('+').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    calc.text(calc.text()+res.text()+' +');
    res.text('  ');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30).marginRight('39%');

div().append().text('±').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(eval(res.text() + '* -1'));
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30).marginLeft('5%');

div().append().text('0').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'0');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('=').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    calc.text(calc.text()+res.text());
    var result=calc.text().replace(/×/g, '*').replace(/÷/g, '/');
    var final=eval(result);
    res.text(final);
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);

div().append().text('.').size('12%','6%').bgColor('#828282').textAlignCenter().click(function(dv, e) {
    res.text(res.text()+'.');
}).hover(function(dv) {
    dv.bgColor('#aaaaaa');
    dv.cursor('pointer');
}, function(dv) {
    dv.bgColor('#828282');
}).paddingUpDown('2%').fontSize(30);