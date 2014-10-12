package com.xuebage.play2048;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

public class GameView extends GridLayout {

	public GameView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.initGameView();
	}

	public GameView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.initGameView();
	}

	public GameView(Context context) {
		super(context);
		this.initGameView();
	}

	public void initGameView() {
		// ע��ص����������û�������Ļʱ��ϵͳ���лص���
		this.setOnTouchListener(new OnTouchListener() {
			private float startX, startY, offsetX, offsetY;

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					startX = event.getX();
					startY = event.getY();
					return true;
				case MotionEvent.ACTION_UP:
					offsetX = event.getX() - startX;
					offsetY = event.getY() - startY;
					if (Math.abs(offsetX) > Math.abs(offsetY)) {
						if (offsetX > 5) {
							slideRight();
							return true;
						} else if (offsetX < -5) {
							slideLeft();
							return true;
						}
					} else {
						if (offsetY > 5) {
							slideDown();
							return true;
						} else if (offsetY < -5) {
							slideUp();
							return true;
						}
					}
					break;
				default:
					break;
				}
				// ������뷵��true�������false ��ʾ����ϵͳ����ACTION_DOWN�¼�û�гɹ����Ͳ�����ȥ���������¼������磺ACTION_UP��ACTION_MOVE��
				// return true;
				return false;
			}

		});
	}

	public void slideLeft() {

	}

	public void slideRight() {

	}

	public void slideUp() {

	}

	public void slideDown() {

	}

}
