class Student {
	int studentID;
	void setStudentID(int stid) {
		if(stid<=0){
			stid=0;
		}else if(stid>=99999999){
				stid=99999999;
				studentID = stid;
			}
		return;
	}
	int getStudentID(){
		return studentID;
	}
}
