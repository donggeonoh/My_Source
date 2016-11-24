

var root = div().append().size('100%', '100%').bgColor('green');

div().appendTo(root).size(100, 100).bgColor('red').click(function(dv, e) {
    e.preventDefault();
    e.stopPropagation();

    dv.text('hello');
}).hover(function(dv) {
    dv.bgColor('violet');
}, function(dv) {
    dv.bgColor('blue');
});

div().appendTo(root).size(100, 100).bgColor('gray').editable();