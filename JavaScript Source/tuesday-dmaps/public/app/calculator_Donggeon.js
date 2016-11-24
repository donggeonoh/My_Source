/**
 * @author Donggeon Oh
 * @Date 2016-11-18
 */

var operateText = ['MC', 'MR', 'MS', 'M+', 'M-', '←', 'CE', 'C', '±', '√', '7' ,'8', '9', '/', '%', '4', '5', '6', '*', '1/x', '1', '2', '3', '-', '=', '0', '.', '+'];

var outsideDiv = new Div();     //계산기 전체의 Div

var textDiv = new Div();        //subText, mainText를 담고있는 Div

var subTextDiv = new Div();
var mainTextDiv = new Div();

var operateDiv = new Div();     //operator, number를 담고있는 Div

// 전체적인 계산기의 사이즈 설정
outsideDiv.append().size('70%', '80%').position('absolute').top('10%').left('15%');

textDiv.appendTo(outsideDiv).height('20%').displayBlock();

subTextDiv.appendTo(textDiv).paddingTop('1%').paddingRight('3%').height('33%').bgColor('#8f94ab').fontSize('1.5em').textAlign('right').text("5 + 2").displayBlock();
mainTextDiv.appendTo(textDiv).paddingTop('2%').paddingRight('3%').height('66%').bgColor('#a0a7c3').fontSize('2.5em').textAlign('right').text("7").displayBlock();

operateDiv.appendTo(outsideDiv).height('80%').displayBlock();

var touchDiv = function (dv, e) {
    dv.css('background-color', '#aab2ba');
};

var leaveDiv = function (dv, e) {
    dv.css('background-color', '#d0d8ed');
};

var operDivClick = function(dv) {
    mainTextDiv.text(mainTextDiv.text() + dv.text());
};

for(var i = 0; i < 28; i++) {
    if(operateText[i] === '=') {
        div().appendTo(operateDiv).displayInlineBlock().position('absolute').bgColor('#d0d8ed').size('20%', '26.5%').fontSize('3.5em').textAlign('center').text("=").hover(touchDiv, leaveDiv).click();
        continue;
    } else if(operateText[i] === '0') {
        div().appendTo(operateDiv).displayInlineBlock().bgColor('#d0d8ed').size('40%', '16.6%').fontSize('3.5em').textAlign('center').text("0").hover(touchDiv, leaveDiv);
        continue;
    }

    div().appendTo(operateDiv).displayInlineBlock().bgColor('#d0d8ed').size('20%', '16.7%').fontSize('3.5em').textAlign('center').text(operateText[i]).hover(touchDiv, leaveDiv).click(operDivClick);
}