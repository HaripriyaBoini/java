package constructor;

 public class Box {
double length;
double width;
double height;
      
 Box() {
      length=-1;
       width=-1;
        height=-1;
}
Box(double l,double w,double h){
	length=l;
	width=w;
	height=h;
	
}
Box(int side){
	length=width=height=5;
	
}
}