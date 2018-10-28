package oo.day04;
//T型
public class T extends Tetromino {
	T(){
		this(0,0);
	}
	T(int row,int col){
		super(); //默认--调用父类的无参构造方法
		super.cells[0] = new Cell(row,col); //创建Cell对象
		super.cells[1] = new Cell(row,col+1);
		super.cells[2] = new Cell(row,col+2);
		super.cells[3] = new Cell(row+1,col+1);
	}

	void print(){ //输出4个格子的行号和列号
		System.out.println("I am a T:");
		super.print(); //调用父类的print()方法
	}
}














