/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_mensuration_eloise;

import javax.swing.JOptionPane;
public class shape3 {
    int radius;
    int height;
    String unit;
    public shape3 (){}
    public shape3(int r, int h){
        this.radius=r;
        this.height=h;
    };
    double volume(){
        double V=(Math.PI*radius*radius*height)/3;
        return V;
    }
    void shape3_details(){
        System.out.println("Chosen shape: right circular cylinder");
        System.out.println("Find the: volume");
        String unit1 = JOptionPane.showInputDialog("Enter units used:");
        JOptionPane.showMessageDialog(null, "Entered units is " + unit1);
        
        int A1=Integer.parseInt(JOptionPane.showInputDialog("Enter radius value"));
        JOptionPane.showMessageDialog(null, "Entered radius value is " + A1+" "+unit1);
        System.out.println("radius: "+A1+" "+unit1);
        
        int B1=Integer.parseInt(JOptionPane.showInputDialog("Enter height value"));
        JOptionPane.showMessageDialog(null, "Entered height value is " + B1+" "+unit1);
        System.out.println("height: "+B1+" "+unit1);
        
        System.out.println("Answer:");
                shape3 shape1 = new shape3 (A1,B1);
                shape1.unit = "sq." +unit1;
                shape1.volume();
                System.out.print("the volume is ");
                System.out.print(shape1.volume());
                System.out.print(" "+shape1.unit);
                JOptionPane.showMessageDialog(null, "the volume is " 
                        +shape1.volume()+" "+ shape1.unit);
    }
}
