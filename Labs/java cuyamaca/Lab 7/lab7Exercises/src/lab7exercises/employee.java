/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7exercises;

/**
 *
 * @author Madison
 */
public class employee extends person {
    protected String jobSkills; 
    protected int yearsWorked; 

    public employee() {
        super(); // this invokes the inhereited constructor first 
        
        jobSkills = ""; 
        yearsWorked = 0; 
        
    }

    public String getJobSkills() {
        return jobSkills;
    }

    public void setJobSkills(String jobSkills) {
        this.jobSkills = jobSkills;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }
    // override 
    public String getInfo() {
        return " Name: " + name + " Address: " + address + " Age: " + 
                Integer.toString(age) + " Skills: " + jobSkills + " Years: " + 
                Integer.toString(yearsWorked); 
    } 
    
} // end employee class
