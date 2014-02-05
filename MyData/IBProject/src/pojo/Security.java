package pojo;

public class Security {
private String secName;
//private static double buyNetPosition=0;
//private static double sellNetPosition=0;
private static double netPosition=0;
public Security(String secName) {
	this.secName = secName;
	
}
public String getSecName() {
	return secName;
}
public void setSecName(String secName) {
	this.secName = secName;
}

public double getNetPosition() {
	return netPosition;
}
public void setNetPosition(double netPosition) {
	Security.netPosition = netPosition;
}

public Security() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Security [secName=" + secName + ", netPosition=" + netPosition
			+ "]";
}

}
