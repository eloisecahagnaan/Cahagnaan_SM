/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_mensuration_eloise;

import javax.swing.JOptionPane;
public class shape1 {
    int radius;
    String unit;
    public shape1 (){}
    public shape1(int a){
        this.radius=a;
    };
    double volume(){
        double V=(4/3)*Math.PI*radius*radius*radius;
        return V;
    }
    void shape1_details(){
        System.out.println("Chosen shape: sphere");
        System.out.println("Find the: volume");
        String unit1 = JOptionPane.showInputDialog("Enter units used:");
        JOptionPane.showMessageDialog(null, "Entered units is " + unit1);
        
        int A2=Integer.parseInt(JOptionPane.showInputDialog("Enter radius value"));
        JOptionPane.showMessageDialog(null, "Entered radius value is " + A2+" "+unit1);
        System.out.println("radius: "+A2+" "+unit1);
        
        System.out.println("Answer:");
                shape1 shape1 = new shape1 (A2);
                shape1.unit = "sq." +unit1;
                shape1.volume();
                System.out.print("the volume is ");
                System.out.print(shape1.volume());
                System.out.print(" "+shape1.unit);
                JOptionPane.showMessageDialog(null, "the volume is " 
                        +shape1.volume()+" "+ shape1.unit);
    }
}