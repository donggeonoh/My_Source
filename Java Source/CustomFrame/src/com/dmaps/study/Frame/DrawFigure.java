package com.dmaps.study.Frame;

public class DrawFigure {
	
	public DrawFigure(String figure) {
		
		switch (figure) {
		case "line":
			Drawline();
			break;

		case "circle":
			DrawCirle();
			break;
			
		case "square":
			DrawSquare();
			break;
		case "background":
			DrawBackground();
			break;
		default:
			break;
		
		}
		
	}

	private void DrawSquare() {
		
	}

	private void DrawCirle() {
		// TODO Auto-generated method stub
		
	}

	private void Drawline() {
		// TODO Auto-generated method stub
		
	}

	private void DrawBackground() {
		
	}
	
}
