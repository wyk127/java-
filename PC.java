package lar;

class PC {
	  CPU cpu;
	  HardDisk disk;
	  void setCPU(CPU cpu){
	   this.cpu=cpu;
	  }
	  void setHardDisk(HardDisk disk){
	   this.disk=disk; 
	  }
	  void show(){
	   System.out.println("CPU�ٶ�"+cpu.getSpeed());
	   System.out.println("Ӳ������"+disk.getAmount());
	  
}
}