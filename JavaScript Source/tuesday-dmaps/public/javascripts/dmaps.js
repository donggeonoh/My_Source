/**
 * Created by JiSoo on 2016-10-05.
 */

var div = function () {
    return new Div();
};

function Div () {
    this.$ = $('<div></div>');
    this.displayInlineBlock();
}

Div.prototype.css = function (key, value) {
    if (value === undefined) {
        this.$.css(key);
        return this;
    }

    this.$.css(key, value);
    return this;
};

Div.prototype.appendTo = function (parent) {
    this.$.appendTo(parent.$);
    return this;
};

Div.prototype.append = function () {
    this.$.appendTo('body');
    return this;
};

Div.prototype.text = function (txt) {
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
Div.prototype.margin = function (px) {
    this.$.css('margin', px + 'px');
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
Div.prototype.border = function (px) {
    this.$.css('border', px + 'px');
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