int ldrPin = A0;  // LDR connected to A0

void setup() {
  Serial.begin(9600);
}

void loop() {
  int value = analogRead(ldrPin); // read light (0–1023)
  Serial.println(value);          // send to PC
  delay(200);
}
