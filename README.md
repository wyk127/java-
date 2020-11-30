# java-实验一实验报告


#### 一.实验内容

1.学会类的创建。

2· 掌握对象的创建，对象对属性和行为的调用和赋值。

3· 掌握构造方法的创建，并学会使用如何调用构造方法。

4· 理解并掌握修饰符public,protected,友好型，private各自作用。
***



#### 二.核心方法
 
 
 ###### 在CPU类中
 ----- 	  CPU cpu =new CPU();

	  cpu.setSpeed(2200);

	  HardDisk disk=new HardDisk();

	  disk.setAmount(200);

	  PC pc=new PC();
	  pc.setCPU(cpu);
	  pc.setHardDisk(disk);
	pc.show();
***

-----   int speed; 

        int getSpeed(){
	
	return speed;
	
		  }
	public void setSpeed(int speed){
	
        this.speed=speed;
	
		  }
		  
  ***
  
-----	  CPU cpu;

	  HardDisk disk;
	  
	  void setCPU(CPU cpu){
	  
	   this.cpu=cpu;
	   
	  }
	  
	  void setHardDisk(HardDisk disk){
	  
	   this.disk=disk;



#### 三.实验设计
  1.在main方法中创建一个CPU,HardDisk,PC对象，其中将cpu自己的speed值设为2200，disk将自己的amount值设为200
  
  2.pc调用setPCU（CPUc）方法，调用实参是cpu
  
  3.pc调用setDisk方法，调用实参是disk
  
  4.pc调用show（）方法
  
  
  
  
#### 四.实验感想
  通过本次实验学会了类的创建，对象的创建，学会了如何调用构造方法。Java还是很有难度的，以后要努力学习，争取能入门。














