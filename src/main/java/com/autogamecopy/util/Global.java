/*
 * Copyright (C) 2016 Benjamin Schellenberger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.autogamecopy.util;

/**
 *
 * @author Benjamin Schellenberger
 */
public final class Global {

    private Global() {

    }

    public static final String APPLICATION_TITLE = "Auto Game Copy";
    public static final String APPLICATION_VERSION = "0.1";
    public static final String APPLICATION_FULL_TITLE = Global.APPLICATION_TITLE + " v" + Global.APPLICATION_VERSION;

    public static void EXIT_APPLICATION() {
        System.exit(0);
    }

}
