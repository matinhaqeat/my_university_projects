# LDR-Based Automatic Brightness Control System

## 📌 Description
This project uses an LDR (Light Dependent Resistor) to measure ambient light and automatically adjust brightness levels. The system reads light intensity using an Arduino and sends the data to a Python program for processing and visualization.

## ⚙️ Components Used
- Arduino Uno
- LDR (Light Sensor)
- Resistor (10kΩ)
- Breadboard
- Jumper Wires
- USB Cable

## 🔌 Circuit Setup
The LDR is connected in a voltage divider configuration:
- One side of LDR → 5V
- Other side → Analog pin (A0) + Resistor to GND

## 💻 Software
- Arduino IDE (for uploading code)
- Python 3
- PySerial library (for serial communication)

## 🚀 How It Works
1. The LDR detects light intensity.
2. Arduino reads analog values (0–1023).
3. Data is sent via serial port.
4. Python script reads the data and processes it.
5. Output can be used to control brightness (e.g., LEDs or screen).

## ▶️ How to Run

### Arduino
1. Connect Arduino to your computer.
2. Upload the Arduino code using Arduino IDE.

### Python
1. Install dependencies:
   ```bash
   pip install pyserial
