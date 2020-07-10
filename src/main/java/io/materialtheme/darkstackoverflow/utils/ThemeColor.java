/**
 * Copyright 2020 Vincenzo Palazzo vincenzopalazzodev@gmail.com
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 * and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package io.materialtheme.darkstackoverflow.utils;

import mdlaf.utils.MaterialColors;

import javax.swing.plaf.ColorUIResource;

/**
 * @author https://github.com/vincenzopalazzo
 */
public class ThemeColor {

    public static class GlobalColor{

        /**
         * This is the background color, I use this color for all component inside the application
         * is the principal color of the application
         */
        private static final ColorUIResource backgroundPrimary = new ColorUIResource(57, 57, 57);

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
