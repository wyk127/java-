# java-实验一
# 实验内容
   用类描述描述计算机中CPU的速度和硬盘的容量。



*实验方法
 
 
 
 ----- 	  CPU cpu =new CPU();

	  cpu.setSpeed(2200);

	  HardDisk disk=new HardDisk();

	  disk.setAmount(200);

	  PC pc=new PC();
	  pc.setCPU(cpu);
	  pc.setHardDisk(disk);
	pc.show();
	  
-----   int speed;
        int getSpeed(){
	return speed;
		  }
	public void setSpeed(int speed){
        this.speed=speed;
		  }
  
-----	  CPU cpu;
	  HardDisk disk;
	  void setCPU(CPU cpu){
	   this.cpu=cpu;
	  }
	  void setHardDisk(HardDisk disk){
	   this.disk=disk;



*实验设计
  在main方法中创建一个CPU,HardDisk,PC对象，其中将cpu自己的speed值设为2200，disk将自己的amount值设为200
  pc调用setPCU（CPUc）方法，调用实参是cpu
  pc调用setDisk方法，调用实参是disk
  pc调用show（）方法
  
  
  
  
*实验感想
  第一次编写Java，感受到了Java的难度














