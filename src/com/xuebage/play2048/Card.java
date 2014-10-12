package com.xuebage.play2048;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {
	// 卡片与数字进行绑定
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
		// -1 -1 代表填充整个屏幕，布局   这里使用具体的作用？？？
		LayoutParams lp = new LayoutParams(-1, -1);
		addView(label, lp);
		setNum(0);
	}

	// 需要呈现文字，需要显示出来；在构造方法中对其进行初始化
	private TextView label;

	// 判断卡片是否相同？
	@Override
	public boolean equals(Object o) {
		if (o instanceof Card) {
			return getNum() == ((Card) o).getNum();
		}
		return false;
	}

}
