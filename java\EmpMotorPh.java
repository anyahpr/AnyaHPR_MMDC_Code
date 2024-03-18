
//Make sure that you have an employee details print out.
public class EmpMotorPh {
// Personal information
private String name;
private String birthday;
private String address;
private String phoneNumber;

// Employment details
private String sssNumber;
private String philHealthNumber;
private String tinNumber;
private String pagIbigNumber;
private String status;
private String position;
private String supervisor;

// Salary details
private double basicSalary;
private double riceSubsidy;
private double phoneAllowance;
private double clothingAllowance;
private double grossSemiMonthlyRate;
private double hourlyRate;

// Constructor
public EmpMotorPh (String name, String birthday, String address, String phoneNumber,
String sssNumber, String philHealthNumber, String tinNumber, String pagIbigNumber,
String status, String position, String supervisor,
double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance,
double grossSemiMonthlyRate, double hourlyRate) {
this.name = name;
this.birthday = birthday;
this.address = address;
this.phoneNumber = phoneNumber;
this.sssNumber = sssNumber;
this.philHealthNumber = philHealthNumber;
this.tinNumber = tinNumber;
this.pagIbigNumber = pagIbigNumber;
this.status = status;
this.position = position;
this.supervisor = supervisor;
this.basicSalary = basicSalary;
this.riceSubsidy = riceSubsidy;
this.phoneAllowance = phoneAllowance;
this.clothingAllowance = clothingAllowance;
this.grossSemiMonthlyRate = grossSemiMonthlyRate;
this.hourlyRate = hourlyRate;
}

// Getters and setters for all attributes

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getBirthday() {
return birthday;
}

public void setBirthday(String birthday) {
this.birthday = birthday;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public String getSssNumber() {
return sssNumber;
}

public void setSssNumber(String sssNumber) {
this.sssNumber = sssNumber;
}

public String getPhilHealthNumber() {
return philHealthNumber;
}

public void setPhilHealthNumber(String philHealthNumber) {
this.philHealthNumber = philHealthNumber;
}

public String getTinNumber() {
return tinNumber;
}

public void setTinNumber(String tinNumber) {
this.tinNumber = tinNumber;
}

public String getPagIbigNumber() {
return pagIbigNumber;
}

public void setPagIbigNumber(String pagIbigNumber) {
this.pagIbigNumber = pagIbigNumber;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getPosition() {
return position;
}

public void setPosition(String position) {
this.position = position;
}

public String getSupervisor() {
return supervisor;
}

public void setSupervisor(String supervisor) {
this.supervisor = supervisor;
}

public double getBasicSalary() {
return basicSalary;
}

public void setBasicSalary(double basicSalary) {
this.basicSalary = basicSalary;
}

public double getRiceSubsidy() {
return riceSubsidy;
}

public void setRiceSubsidy(double riceSubsidy) {
this.riceSubsidy = riceSubsidy;
}

public double getPhoneAllowance() {
return phoneAllowance;
}

public void setPhoneAllowance(double phoneAllowance) {
this.phoneAllowance = phoneAllowance;
}

public double getClothingAllowance() {
return clothingAllowance;
}

public void setClothingAllowance(double clothingAllowance) {
this.clothingAllowance = clothingAllowance;
}

public double getGrossSemiMonthlyRate() {
return grossSemiMonthlyRate;
}

public void setGrossSemiMonthlyRate(double grossSemiMonthlyRate) {
this.grossSemiMonthlyRate = grossSemiMonthlyRate;
}

public double getHourlyRate() {
return hourlyRate;
}

public void setHourlyRate(double hourlyRate) {
this.hourlyRate = hourlyRate;
}

// toString method to display employee details
@Override
public String toString() {
return "Employee{" +
"name='" + name + '\'' +
", birthday='" + birthday + '\'' +
", address='" + address + '\'' +
", phoneNumber='" + phoneNumber + '\'' +
", sssNumber='" + sssNumber + '\'' +
", philHealthNumber='" + philHealthNumber + '\'' +
", tinNumber='" + tinNumber + '\'' +
", pagIbigNumber='" + pagIbigNumber + '\'' +
", status='" + status + '\'' +
", position='" + position + '\'' +
", supervisor='" + supervisor + '\'' +
", basicSalary=" + basicSalary +
", riceSubsidy=" + riceSubsidy +
", phoneAllowance=" + phoneAllowance +
", clothingAllowance=" + clothingAllowance +
", grossSemiMonthlyRate=" + grossSemiMonthlyRate +
", hourlyRate=" + hourlyRate +
'}';
}
}

