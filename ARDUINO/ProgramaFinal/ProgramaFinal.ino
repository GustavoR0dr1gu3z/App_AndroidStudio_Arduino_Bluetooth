#include <SoftwareSerial.h>   // Incluimos la librería  SoftwareSerial  
SoftwareSerial miBT(10,11);    // Definimos los pines RX y TX del Arduino conectados al Bluetooth
char DATO = 0;
int led0 = 0;
int led1 = 1;
int led2 = 2;
int led3 = 3;
int led4 = 4;
int led5 = 5;
int led6 = 6;
int led7 = 7;
 
void setup()
{
  miBT.begin(38400);       // Inicializamos el puerto serie BT (Para Modo AT 2)velocidad= 38400
  pinMode(led0, OUTPUT);     // SE COMO SALIDA EL PIN
  pinMode(led1, OUTPUT);     // SE COMO SALIDA EL PIN
  pinMode(led2, OUTPUT);     // SE COMO SALIDA EL PIN
  pinMode(led3, OUTPUT);     // SE COMO SALIDA EL PIN
  pinMode(led4, OUTPUT);     // SE COMO SALIDA EL PIN
  pinMode(led5, OUTPUT);     // SE COMO SALIDA EL PIN
  pinMode(led6, OUTPUT);     // SE COMO SALIDA EL PIN
  pinMode(led7, OUTPUT);     // SE COMO SALIDA EL PIN
}
 
void loop()
{
  if(miBT.available())    // Si llega un dato por el puerto BT se envía al monitor serial
  {
    DATO = miBT.read();
    if(DATO == 'I'){
      digitalWrite(led, HIGH);
    }
    if(DATO == 'O'){
      digitalWrite(led, LOW);
    }
    if(DATO == 'U'){
      
    }
    if(DATO == 'D'){
      
    }
    if(DATO == ''){
      
    }
  }
}
