package Soal_B;

 class ServicePackage {
	public String service;
    public int value;
    
    public ServicePackage(String service, int value) {
	        this.service = service;
	        this.value = value;
	    }

	    public String getService() {
	        return service;
	    }

	    public void setService(String service) {
	        this.service = service;
	    }

	    public int getValue() {
	        return value;
	    }

	    public void setValue(int value) {
	        this.value = value;
	    }

}
