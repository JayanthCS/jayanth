package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Camera;
import com.xworkz.inheritance.thing.Device;

public class DeviceRunner {

	public static void main(String[] args) {

		Camera camera = new Camera();
		camera.electronic("Camera");
		camera.getBrand();

		Device device = new Camera();
		device.getBrand();

		Camera casted = (Camera) device;
		casted.electronic("Camera");
	}
}
