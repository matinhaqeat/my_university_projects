import serial
import screen_brightness_control as sbc
import time

arduino_port = '/dev/ttyUSB0'  # your port
baud_rate = 9600

try:
    ser = serial.Serial(arduino_port, baud_rate, timeout=1)
    time.sleep(2)
except:
    print("Cannot connect to Arduino. Check port.")
    exit()

print("Running auto brightness...")

prev_brightness = 50  # start value

while True:
    try:
        line = ser.readline().decode('utf-8').strip()
        
        if line.isdigit():
            ldr_value = int(line)

            # Inverse + smoother mapping
            brightness = int((1 - ldr_value / 1023) ** 0.5 * 100)

            # limit range
            brightness = max(10, min(brightness, 100))

            # smooth transition
            brightness = int((brightness + prev_brightness) / 2)
            prev_brightness = brightness

            sbc.set_brightness(brightness)

            print(f"LDR: {ldr_value} → Brightness: {brightness}%")

        time.sleep(0.2)

    except KeyboardInterrupt:
        print("Stopped.")
        break
    except Exception as e:
        print("Error:", e)
