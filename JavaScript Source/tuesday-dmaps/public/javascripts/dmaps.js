/**
 * Created by JiSoo on 2016-10-05.
 */

var div = function () {
    return new Div();
};

function Div () {
    this.$ = $('<div></div>');
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

Div.prototype.margin = function (px) {
    this.$.css('margin', px);
    return this;
};

/**
 *
 * @author eunchong
 * @date    16.10.11
 * @returns {Div}
 */
Div.prototype.border = function (px) {
    this.$.css('border', px+'px solid black');
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

Div.prototype.border = function (px) {
    this.$.css('border', px + 'px solid black');
    return this;
};

Div.prototype.fontSize = function (px) {
    this.$.css('font-size', px);
    return this;
};

Div.prototype.fontColor = function (c) {
    this.$.css('color', c);
    return this;
};