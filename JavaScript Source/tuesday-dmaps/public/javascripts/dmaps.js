/**
 * Created by JiSoo on 2016-10-05.
 */

var div = function () {
    return new Div();
};

//객체(생성자) Div, 함수 div
function Div () {
    this.$ = $('<div></div>');
    this.displayInlineBlock();
    // this.fontSize(0);
}

Div.prototype.css = function (key, value) {
    if (value === undefined) {
        this.$.css(key);
        return this;
    }

    this.$.css(key, value);
    return this;
};

Div.prototype.attr = function (key, value) {
    if (value === undefined) {
        this.$.attr(key);
        return this;
    }

    this.$.attr(key, value);
    return this;
};

Div.prototype.appendTo = function (parent) {
    this.$.appendTo(parent.$);
    return this;
};

Div.prototype.append = function () {
    $('body').append(this.$);
    return this;
};

Div.prototype.text = function (txt) {
    if (txt === undefined) {
        return this.$.text();
    }

    // this.fontSize(14);
    this.$.text(txt);
    return this;
};


Div.prototype.bgColor = function (c) {
    this.$.css('background-color', c);
    return this;
};

/**
 * @modified margin - Donggeon Oh
 */
Div.prototype.margin = function (size) {
    this.$.css('margin', size);
    return this;
};
/**
 * @autor eun-chong
 * @date 16.11.15
 * @returns {Div}
 * @add :marginSide,marginUpDown,textAlignCenter,paddingUpDown
 */
Div.prototype.paddingUpDown=function(px) {
    this.$.css('padding-top',px);
    this.$.css('padding-bottom',px);
    return this;
};

Div.prototype.marginSide=function(px) {
    this.$.css('margin-left',px);
    this.$.css('margin-right',px);
    return this;
};

Div.prototype.marginUpDown=function(px) {
    this.$.css('margin-top',px);
    this.$.css('margin-bottom',px);
    return this;
};

Div.prototype.size = function(w, h) {
    this.$.css('width', w);
    this.$.css('height', h);
    return this;
};

Div.prototype.width = function(w) {
    if (arguments.length === 0) {
        return this.$.css('width');
    }
    this.$.css('width', w);
    return this;
};

Div.prototype.height = function(w) {
    if (arguments.length === 0) {
        return this.$.css('height');
    }
    this.$.css('height', w);
    return this;
};

/**
 *
 * @author eunchong
 * @date    16.10.11
 * @returns {Div}
 * @modify : border 수정 - 오동건
 */
Div.prototype.border = function (size) {
    this.$.css('border', size);
    return this;
};

Div.prototype.fontSize = function (px) {
    this.$.css('font-size', px);
    return this;
};

Div.prototype.marginTop = function (px) {
    this.$.css('margin-top', px);
    return this;
};

Div.prototype.marginRight = function (px) {
    this.$.css('margin-right', px);
    return this;
};

Div.prototype.marginBottom = function (px) {
    this.$.css('margin-bottom', px);
    return this;
};

Div.prototype.marginLeft = function (px) {
    this.$.css('margin-left', px);
    return this;
};

Div.prototype.fontColor = function (c) {
    this.$.css('color', c);
    return this;
};

Div.prototype.displayInlineBlock = function() {
    this.$.css('display', 'inline-block');
    return this;
};

Div.prototype.displayBlock = function() {
    this.$.css('display', 'block');
    return this;
};

/**
 * @author Donggeon Oh
 * @date    16-11-15
 */

Div.prototype.float = function(position) {
    if (position === undefined) {
        return this.$.css('float');
    }

    this.$.css('float', position);
    return this;
};

/**
 * @modify Donggeon Oh
 * @param size
 * @returns {Div}
 */
Div.prototype.padding = function(size) {
    if (size === undefined) {
        return this.$.css('padding');
    }

    this.$.css('padding', size);
    return this;
};

Div.prototype.textAlign = function(position) {
    if (position === undefined) {
        return this.$.css('text-align');
    }

    this.$.css('text-align', position);
    return this;
};

Div.prototype.textAlignCenter = function() {
    this.$.css('text-align', 'center');
    return this;
};

Div.prototype.fontFamily = function(font) {
    if (font === undefined) {
        return this.$.css('font-family');
    }

    this.$.css('font-family', font);
    return this;
};

Div.prototype.paddingTop = function (size) {
    this.$.css('padding-top', size);
    return this;
};

Div.prototype.paddingRight = function (size) {
    this.$.css('padding-right', size);
    return this;
};

Div.prototype.paddingBottom = function (size) {
    this.$.css('padding-bottom', size);
    return this;
};

Div.prototype.paddingLeft = function (size) {
    this.$.css('padding-left', size);
    return this;
};

Div.prototype.borderRadius = function (radius) {
    this.$.css('border-radius', radius);
    return this;
};

Div.prototype.position = function (position) {
    this.$.css('position', position);
    return this;
};


/**
 * @author Jisoo Yoon
 * @param top
 * @param left
 * @desc  1. root.offset();
 *        2. offset({top: '24px', left: '35px'});
 *        3. offset(24, 32);
 */

Div.prototype.offset = function (top, left) {
    var obj = {};

    if (arguments.length === 0) {
        return {
            top: this.$.css('top'),
            left: this.$.css('left')
        };
    }
    else if (typeof top === 'object') {
        obj = top;
        this.$.css('top', obj.top);
        this.$.css('left', obj.left);

        return this;
    }

    this.$.css('top', top);
    this.$.css('left', left);

    return this;
};

Div.prototype.top = function (position) {
    this.$.css('top', position);
    return this;
};

Div.prototype.left = function (position) {
    this.$.css('left', position);
    return this;
};

Div.prototype.deco = function (fn) {
    if (typeof fn !== 'function') {
        return this;
    }

    fn(this);
    return this;
};

Div.prototype.minWidth = function(px) {
    if (px === undefined) {
        return this.$.css('min-width');
    }

    this.$.css('min-width', px);
    return this;
};

Div.prototype.minHeight = function() {
    if (px === undefined) {
        return this.$.css('min-height');
    }

    this.$.css('min-height', px);
    return this;
};

Div.prototype.click = function(fn) {
    if (fn === undefined) {
        this.$.click();
        return this;
    }

    var that = this;
    this.$.click(function(e) {
        if (fn) fn(that, e);
    });

    return this;
};

Div.prototype.hover = function(fn1, fn2) {
    if (fn1 === undefined || fn2 === undefined) {
        this.$.hover();
        return this;
    }

    var that = this;
    this.$.hover(function(e) {
        if (fn1) fn1(that, e);
    }, function(e) {
        if (fn2) fn2(that, e);
    });

    return this;
};

Div.prototype.editable = function() {
    this.$.attr('contenteditable', 'true');
    return this;
};