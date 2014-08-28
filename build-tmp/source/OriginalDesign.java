import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int hairx = 200;
int hairy = 220;
int facex = 200;
int facey = 220;

public void setup(){
    size(400,400);
    background(204, 120, 41);
}

public void face(){
        fill(255,255,0);
        strokeWeight(5);
        //face
        ellipse(facex,facey+13,100,100);
        
        fill(255,0,0);
        //right eye
        curve(facex+306,facey+426,facex-6,facey+34,facex-10,facey+31,facex+223,facey-14);
        //left eye
        curve(facex+57,facey+334,facex+11,facey+34,facex+15,facey+31,facex-377,facey+174);
        //mouth
        curve(facex,facey-1,facex+38,facey+43,facex-41,facey+41,facex-107,facey-37);
};

public void flames(){
        //flames in hair
        fill(255,0,0);
        triangle(hairx+-23,hairy+-116,hairx+32,hairy+0,hairx+-15,hairy-33);
        triangle(hairx+8,hairy+-129,hairx+32,hairy+0,hairx+-15,hairy-33);
        triangle(hairx+-108,hairy+-89,hairx+-21,hairy+0,hairx+-10,hairy-33);
        triangle(hairx+-44,hairy+-75,hairx+-59,hairy+-133,hairx+8,hairy-39);
        triangle(hairx+31,hairy+-156,hairx+40,hairy+-25,hairx+7,hairy+7);
        triangle(hairx+5,hairy+-85,hairx+-42,hairy+-41,hairx+8,hairy-39);
        triangle(hairx+71,hairy+-85,hairx+21,hairy+2,hairx+8,hairy-39);
        triangle(hairx+44,hairy+18,hairx-65,hairy+-99,hairx-41,hairy-3);
        triangle(hairx+43,hairy+22,hairx+57,hairy+-65,hairx+12,hairy-6);
        triangle(hairx-20,hairy+14,hairx-63,hairy+16,hairx-45,hairy-26);
        triangle(hairx,hairy-20,hairx-34,hairy-22,hairx-12,hairy-67);
        triangle(hairx+40,hairy-5,hairx-15,hairy-2,hairx+13,hairy-60);
        triangle(hairx+61,hairy+17,hairx+31,hairy+17,hairx+44,hairy-34);
        triangle(hairx+52,hairy+18,hairx+20,hairy-2,hairx+26,hairy-51);
        triangle(hairx+41,hairy+19,hairx-45,hairy+19,hairx-32,hairy-49);
        triangle(hairx+2,hairy+19,hairx-39,hairy+9,hairx-67,hairy-58);
        triangle(hairx+9,hairy+19,hairx-22,hairy+9,hairx-58,hairy-71);

        //underside flames
        curve(facex-163,facey-500,facex-64,facey+18,facex+61,facey+18,facex-48,facey-279);
};

public void draw(){

        flames();
        face();
};
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
