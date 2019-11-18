package selection;

public class course {
	 String id;      //课程号
	 String cname;   //课程名
	 String place;   //地点
	 String time;    //时间
	 String credit;  //学分
	 String teacher;  //任课教师
	 public course(String id,String cname,String place,String time,String credit,String teacher){
	  this.id=id;
	  this.cname=cname;
	  this.place=place;
	  this.time=time; 
	  this.credit=credit;
	  this.teacher=teacher;
	  //重写course类的构造方法，并且传入参数
	}
}


