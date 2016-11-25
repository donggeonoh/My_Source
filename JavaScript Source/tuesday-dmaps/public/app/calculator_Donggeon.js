/**
 * @author Donggeon Oh
 * @Date 2016-11-18
 */

var operateText = ['←', 'CE', 'C', '±', '+', '-', '×', '÷', 7 ,8, 9, '√', 4, 5, 6, '1/x', 1, 2, 3, '.', 0, '='];

var outsideDiv = new Div();     //계산기 전체의 Div

var textDiv = new Div();        //subText, mainText를 담고있는 Div

var subTextDiv = new Div();
var mainTextDiv = new Div();

var operateDiv = new Div();     //operator, operand를 담고있는 Div

var oper = new Array();         //각 operator, operand의 Div

for(var j = 0; j < 22; j++) {   //Div 객체 생성
    oper[j] = new Div();
}

var touchDiv = function (dv, e) {
    dv.css('background-color', '#aab2ba');
};

var leaveDiv = function (dv, e) {
    dv.css('background-color', '#d0d8ed');
};

var delDivClick = function (dv, e) {
    var operand = mainTextDiv.text();
    var array = new Array();

    if(operand.length == 0) {
        return;
    }

    array = operand.split("");
    array.pop();

    operand = array.join("");

    mainTextDiv.text(operand);
};

var rootDivClick = function(dv, e) {
    if(mainTextDiv.length == 0) return;

    var operand = mainTextDiv.text();

    operand = Math.sqrt(operand);

    mainTextDiv.text(operand);
};

var reciprocDivClick = function (dv, e) {
    if(mainTextDiv.length == 0) return;

    mainTextDiv.text(1 / mainTextDiv.text());
};

var operandDivClick = function(dv, e) {
    var operand = mainTextDiv.text();

    if(dv.text() == 0 && operand.length == 1 && mainTextDiv.text() == 0) return;

    if(dv.text() != 0 && operand == 0 && operand.length == 1) {
        mainTextDiv.text(dv.text());
        return;
    }

    mainTextDiv.text(mainTextDiv.text() + dv.text());
};

var operatorDivClick = function (dv, e) {
    var operand = mainTextDiv.text();

    if(operand.length == 0 || operand == 0) return;

    mainTextDiv.text(operand + " " + dv.text() + " ");

    subTextDiv.text(subTextDiv.text() + mainTextDiv.text());
    mainTextDiv.text("");
};

var ceDivClick = function (dv, e) {
    mainTextDiv.text("");
};

var cDivClick = function (dv, e) {
    subTextDiv.text("");
    mainTextDiv.text("");
};

var plusMinusDivClick = function (dv, e) {
    var operand = mainTextDiv.text();

    operand *= -1;

    mainTextDiv.text(operand);
};

var equalDivClick = function (dv, e) {
    subTextDiv.text(subTextDiv.text() + mainTextDiv.text());

    var str = subTextDiv.text();
    var result;

    str = str.replace(/÷/g, '/').replace(/×/g, '*');
    result = eval(str);

    subTextDiv.text("");
    mainTextDiv.text(result);
};

var dotDivClick = function (dv, e) {
    var operand = mainTextDiv.text();
    var spliter = operand.split("");

    if(operand.length == 0) return;

    for(var i = 0; i < spliter.length; i++) {
        if(spliter[i] == '.') return;
    }

    mainTextDiv.text(mainTextDiv.text() + ".");
};

// 전체적인 계산기의 사이즈 설정
outsideDiv.append().size('70%', '80%').position('absolute').top('10%').left('15%').disDraggable();

textDiv.appendTo(outsideDiv).height('20%').displayBlock().textAlign('right').displayBlock();

subTextDiv.appendTo(textDiv).paddingTop('1%').paddingRight('3%').height('33%').bgColor('#8f94ab').fontSize('1.5em').displayBlock();
mainTextDiv.appendTo(textDiv).paddingTop('2%').paddingRight('3%').height('66%').bgColor('#a0a7c3').fontSize('2.5em').displayBlock();

operateDiv.appendTo(outsideDiv).height('80%').fontSize('3em').textAlignCenter().displayBlock().pointer();

for(var i = 0; i < 22; i++) {
    oper[i].appendTo(operateDiv).displayInlineBlock().bgColor('#d0d8ed').size('25%', '16.6%').hover(touchDiv, leaveDiv);

    if(operateText[i] === 0) oper[i].size('50%', '16.6%').text(operateText[i]).click(operandDivClick);

    else if(typeof operateText[i] === 'number') oper[i].text(operateText[i]).click(operandDivClick);

    else if (operateText[i] === '←') oper[i].text(operateText[i]).click(delDivClick);

    else if(operateText[i] === '=') oper[i].size('50%', '16.6%').text(operateText[i]).click(equalDivClick);

    else if(operateText[i] === '+' || operateText[i] === '-' ||  operateText[i] === '×' || operateText[i] === '÷' ) oper[i].text(operateText[i]).click(operatorDivClick);

    else if(operateText[i] === 'CE') oper[i].text(operateText[i]).click(ceDivClick);

    else if (operateText[i] === 'C') oper[i].text(operateText[i]).click(cDivClick);

    else if (operateText[i] === '±') oper[i].text(operateText[i]).click(plusMinusDivClick);

    else if (operateText[i] === '√') oper[i].text(operateText[i]).click(rootDivClick);

    else if (operateText[i] === '1/x') oper[i].text(operateText[i]).click(reciprocDivClick );

    else if (operateText[i] === '.') oper[i].text(operateText[i]).click(dotDivClick);
}