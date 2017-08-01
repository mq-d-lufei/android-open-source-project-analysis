package com.guoxiaoxing.android.sdk.design.facade;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com
 *
 * @author guoxiaoxing
 * @since 2017/8/1 下午4:32
 */
public class Computer {

    private Camera camera = new CameraImpl();
    private Keyboard keyboard = new Keyboardimpl();

    public void take() {
        camera.take();
    }

    public void write() {
        keyboard.write();
    }
}
