package com.xuebage.play2048;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {
	// ��Ƭ�����ֽ��а�
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
		label.setText("" + num);
	}

	public Card(Context context) {
		super(context);
		label = new TextView(getContext());
		label.setTextSize(40);
		// -1 -1 �������������Ļ������   ����ʹ�þ�������ã�����
		LayoutParams lp = new LayoutParams(-1, -1);
		addView(label, lp);
		setNum(0);
	}

	// ��Ҫ�������֣���Ҫ��ʾ�������ڹ��췽���ж�����г�ʼ��
	private TextView label;

	// �жϿ�Ƭ�Ƿ���ͬ��
	@Override
	public boolean equals(Object o) {
		if (o instanceof Card) {
			return getNum() == ((Card) o).getNum();
		}
		return false;
	}

}
