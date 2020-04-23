package io.materialthemin.darkstackoverflow.utils;

import mdlaf.utils.MaterialColors;

import javax.swing.plaf.ColorUIResource;

public class ThemeColor {

    public static class GlobalColor{

        /**
         * This is the background color, I use this color for all component inside the application
         * is the principal color of the application
         */
        private static final ColorUIResource backgroundPrimary = new ColorUIResource(45, 45, 45);

        /**
         *
         */
        private static final ColorUIResource highlightBackground = new ColorUIResource(255, 204, 1);

        /**
         *
         */
        private static final ColorUIResource highlightBackgroundMiddle= new ColorUIResource(240, 181, 0);

        private static final ColorUIResource highlightBackgroundUnder = new ColorUIResource(94, 85, 60);

        /**
         * Color for all text enable inside the app
         */
        private static final ColorUIResource textColorEnable = MaterialColors.COSMO_LIGTH_GRAY;

        //getter
        public static ColorUIResource getBackgroundPrimary() {
            return backgroundPrimary;
        }

        public static ColorUIResource getHighlightBackground() {
            return highlightBackground;
        }

        public static ColorUIResource getHighlightBackgroundMiddle() {
            return highlightBackgroundMiddle;
        }

        public static ColorUIResource getHighlightBackgroundUnder() {
            return highlightBackgroundUnder;
        }

        public static ColorUIResource getTextColorEnable() {
            return textColorEnable;
        }
    }

    public static class ButtonColors{

        /**
         * color for all normal button inside the app, for the moment also with the default button
         */
        private static final ColorUIResource backgroundButton = new ColorUIResource(47, 111, 170);

        private static final ColorUIResource mouseHoverBackgroundButton = new ColorUIResource(60, 164, 255);

        public static ColorUIResource getBackgroundButton() {
            return backgroundButton;
        }

        public static ColorUIResource getMouseHoverBackgroundButton() {
            return mouseHoverBackgroundButton;
        }
    }
}
