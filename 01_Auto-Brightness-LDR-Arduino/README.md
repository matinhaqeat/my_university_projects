# Auto Brightness Control using LDR and Arduino

## Overview

This project automatically adjusts the computer screen brightness based on ambient light using an LDR sensor and Arduino.

## How it works

* LDR measures environmental light intensity.
* Arduino reads analog values (0–1023).
* Values are sent to the computer via serial communication.
* A Python script maps these values to screen brightness.

## Components

* Arduino Uno
* LDR (Light Dependent Resistor)
* 10kΩ resistor
* Breadboard and wires
* Computer (Linux)

## Circuit

* LDR → 5V
* LDR → A0
* A0 → resistor → GND

## Arduino Code

Reads LDR values and sends them via Serial.

## Python Code

* Reads serial data from Arduino
* Converts light level to brightness
* Adjusts screen brightness in real time

## Usage

1. Upload Arduino code
2. Connect Arduino via USB
3. Run Python script:

   ```
   sudo python3 brightness.py
   ```

## Notes

* Requires `pyserial` and `screen_brightness_control`
* On Linux, root permission may be needed

## Future Improvements

* Smooth brightness transitions
* GUI interface
* Use multiple sensors for accuracy
