package org.kettingpowered.ketting.common.betterservergui;

import java.awt.*;

public final class GUIColors {

    public static final class ChatComponent {

        public static final class ChatColors {
            public static Color DEFAULT = CONSOLE_FOREGROUND;
            public static Color INFO = new Color(0x009900);
            public static Color WARN = new Color(0xFFA500);
            public static Color ERROR = new Color(0xFF0000);
            public static Color FATAL = new Color(0x990000);
        }

        public static Color BACKGROUND = new Color(0x282C34);
        public static Color FOREGROUND = new Color(0xFFFFFF);
        public static Color BORDER = new Color(0xBEBEBE);
        public static Color BORDER_SHADOW = new Color(0x000000);

        public static Color CONSOLE_BACKGROUND = new Color(0x282C34);
        public static Color CONSOLE_FOREGROUND = new Color(0xFFFFFF);

        public static  Color INPUT_BACKGROUND = new Color(0x1E1E1E);
        public static  Color INPUT_FOREGROUND = new Color(0xCCCCCC);
    }

    public static final class PlayerComponent {
        public static Color BACKGROUND = new Color(0x282C34);
        public static Color BORDER = new Color(0xCCCCCC);
        public static Color BORDER_SHADOW = new Color(0x000000);

        public static Color LIST_BACKGROUND = new Color(0x282C34);
        public static Color LIST_FOREGROUND = new Color(0xFFFFFF);
        public static Color LIST_ITEM_BACKGROUND = new Color(0x282C34);
        public static Color LIST_ITEM_SELECTED_BACKGROUND = new Color(0x3E4451);
    }
}
