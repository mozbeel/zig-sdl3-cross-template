package com.zig.minimal; // <- Your game package name

import org.libsdl.app.SDLActivity;

/**
 * A sample wrapper class that just calls SDLActivity
 */
public class ZigSDLActivity extends SDLActivity {
    protected String[] getLibraries() {
        return new String[] { "SDL3", "main" };
    }
}
