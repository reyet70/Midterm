//// Midterm code for 59CST112

/**************************************************************
BE SURE TO CHANGE THE NEXT SEVERAL LINES, USING YOUR REAL NAME.
    MY FIRST NAME IS......Tania
    MY MIDDLE NAME IS.....Elizabeth
    MY LAST NAME IS.......Reyes
    
PICK 3 WORDS THAT START WITH YOUR INITIALS, using lower case letters:
    first word............tan
    second word...........eat
    third word............run
    
USE THESE 3 WORDS TO NAME ALL VARIABLES FOR 3 POOL BALLS.
(You may abbreviate any words, but start with same letter.)
***************************************************************/    

//// GLOBALS FOR 3 colored balls ////

float tanX,  tanY,  tanDX,  tanDY;  
float eatX,  eatY,  eatDX,  eatDY;              
float runX,  runY,  runDX,  runDY;      
           

//// OTHER GLOBALS:  strings, pool table, etc ////

String title=  "CST112 MIDTERM EXAM";
String news=   "Click any ball to reset it to right half of table.  (r resets all.)";
String author=  "Tania Reyes";

//table boundaries
float left=100, right=500, top=100, bottom=350;       
float middle= (left + right)/3;
boolean wall=true;

// pink pool table
int tableRed=255, tableGreen=100, tableBlue=150;      
int score=0,m=0,k=0;

//frame counter
int frame;
float mouseDX;
boolean mouse = false;
float temp;
float collision;

//// SETUP:  size and table
void setup() {
    size( 700, 500 );         
  
    //// MODIFY THIS CODE TO MAKE TABLE CENTERED IN WINDOW.  ++++

    // Table boundaries
    float left =45, right=600, top=140, bottom=420;
    float middle= (left+right) /3;
    
 }


//// NEXT FRAME:  table, bounce off walls, collisions, show all
void draw() {
  background( 250,250,200 );
  rectMode( CORNERS );
  table( left, top, right, bottom );
  buttons();
  bounce();
  collisions();
  movement();
  show();
  messages();
}
void reset(){
  tanX=random (middle, right);tanY=random (top, bottom);
  eatX=random (middle, right); eatY=random (top, bottom);
  runX=random (middle, right); runY=random (top, bottom);
  mouseX=width-75; mouseY=350;
  
//Balls and mouse speed random

tanDX=random (-3,3); tanDY=random (-3,3);
eatDX=random (-3,3); eatDY=random (-3,3);
runDX=random (-3,3); runDY=random (-3,3);
mouseDX=-5;
}

void movement(){
  tanX += tanDX; tanY += tanDY;  
  eatX += eatDX; eatY += eatDY;
  runX += runDX; runY += runDY;
  
}

//// HANDLERS:  keys, click
void keyPressed() {
  if (key == 'e') { exit();  }
  if (key == 'r') { reset (); }
  if (key == 'w') { wall=true; }
  if (key == 'p') { tablePink(); }
  if (key == 'm') {mouse=true; }
  
   
}


//// SCENE:  draw the table with wall down the middle
void table( float east, float north, float west, float south ) {
  fill( tableRed, tableGreen, tableBlue );    // pool table
  strokeWeight(20);
  stroke( 127, 0, 0 );      // Brown walls
  rect( east-20, north-20, west+20, south+20 );

            
  // Start with a WALL down the middle of the table! 
  if (wall) {
    float middle=  (east+west)/2;    
    stroke( 0, 127, 0 );
    line( middle,north+10, middle,south-10 );
  }
  stroke(0);
  strokeWeight(1);
}

void tablePink(){
  
  
}

//// ACTION:  bounce off walls, collisions
void bounce() {
   if (tanX >= right || tanX <= left){
     tanDX*=-1;}
     if (eatX >= right || eatX <= left){
     eatDX*=-1;}
     if (runX >= right || runX <= left){
     runDX*=-1;}
  if (tanY >= bottom || tanY <= top){
     tanDY*=-1;}
     if (eatY >= bottom || eatY <= top){
     eatDY*=-1;}
     if (runY >= bottom || runY <= top){
     runDY*=-1;}
     
}
void collisions() {
  if (dist(tanX, tanY, eatX,eatY) <= 20){
    temp=tanDX;
    tanDX=eatDX;
    eatDX=temp;
    temp=tanDY;
    tanDY=eatDY;
    eatDY=temp;
  }
  if (dist(eatX, eatY, runX,runY) <= 20){
    temp=eatDX;
    eatDX=runDX;
    runDX=temp;
    temp=eatDY;
    eatDY=runDY;
    runDY=temp;
  }
  if (dist(runX, runY, tanX,tanY) <= 20){
    temp=runDX;
    runDX=tanDX;
    tanDX=temp;
    temp=runDY;
    runDY=tanDY;
    tanDY=temp;
  }
        
}


//// SHOW:  balls, messages, etc.
void show() {
  fill (255, 0,0); ellipse(tanX, tanY, 20,20);
  fill (150, 250,0); ellipse (eatX, eatY, 20,20);
  fill (255,0,255); ellipse ( runX, runY, 20,20);
  
  fill (0);
  text ("1", tanX, tanY);
  text ("2", eatX, eatY);
  text ("3", runX, runY);
}
  
    
void buttons() {
    rectMode (CORNER);
    fill (0);
    strokeWeight (3);
    stroke (255);
    rect (40, 50, 90, 40);
    rect (120,50, 100, 50);
    rect (250, 50, 100, 50);
    rect (400, 50, 100, 50);
    fill (255);
  

}
void messages() {
  fill(0);
  text( title, width/3, 15 );
  text( news, width/9, 30 );
  text( author, 10, height-5 );
  text (collision, 75,325);

 
   

}
