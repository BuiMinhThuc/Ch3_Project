package Bai3b;
import Bai3b.DIEM;
public class TAMGIAC extends DIEM {
    protected int a,b,c,d,e,f;
	DIEM A= new DIEM(a,b);
	DIEM B= new DIEM(c,d);
	DIEM C= new DIEM(e,f);
	TAMGIAC(DIEM A,DIEM B,DIEM C)
	{ 	this.A=A;this.B=B;this.C=C;
		System.out.println("Nhap toa do dinh thu 1");
		A.DIEM();
		System.out.println("Nhap toa do dinh thu 2");
		B.DIEM();	
		System.out.println("Nhap toa do dinh thu 3");
		C.DIEM();
	}
}
