/*
 * Copyright (c) Sasha Stevens 2018.
 *
 * This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.sasha.adorufu.mod.remote.packet.events;

import com.sasha.adorufu.mod.remote.packet.LoginResponsePacket;
import com.sasha.eventsys.SimpleEvent;

/**
 * Created by Sasha at 6:43 PM on 8/25/2018
 */
public class LoginResponseEvent extends SimpleEvent {
    private LoginResponsePacket pck;

    public LoginResponseEvent(LoginResponsePacket pck) {
        this.pck = pck;
    }

    public LoginResponsePacket getPck() {
        return pck;
    }
}
