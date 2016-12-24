var op = ['CE', 'C', '<<', '÷', '7', '8', '9', '×', '4', '5', '6', '-', '1', '2', '3', '+', '±', '0', '.', '='];
var i;

var root = div().append().size('100%', '100%').bgColor('lightblue');

var cal_board = div().appendTo(root).size(500, 600).bgColor('gray');

var up_board = div().appendTo(cal_board).size('100%', 150).bgColor('red');

var history_board = div().appendTo(up_board).size('100%', 50).bgColor('#eeeeee').fontSize(30).textAlign('right');
var cur_board = div().appendTo(up_board).size('100%', 100).bgColor('#eeeeee').fontSize(50).textAlign('right');

var down_board = div().appendTo(cal_board).size('100%', 450).bgColor('blue');
for (i=0; i<op.length; i++) {
    div().appendTo(down_board).size('25%', '20%').bgColor('#cccccc').text(op[i]).fontSize(40).textAlignCenter().cursorPointer()
        .hover(function(dv) {
            dv.bgColor('gray');
        }, function(dv) {
            dv.bgColor('#cccccc');
        }).click(function(dv) {
            switch (dv.text()) {
                case '÷':
                case '×':
                case '-':
                case '+':
                    history_board.text(history_board.text() + cur_board.text() + dv.text());
                    cur_board.text('');
                    break;
                case '=':
                    cur_board.text(eval(history_board.text() + cur_board.text()));
                    history_board.text('');
                    break;
                default:
                    cur_board.text(cur_board.text() + dv.text());
            }
    });
}