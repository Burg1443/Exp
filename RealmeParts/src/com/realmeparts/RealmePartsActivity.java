/*
 * Copyright (C) 2017 The OmniROM Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.realmeparts;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class RealmePartsActivity extends Activity {

    private RealmeParts mRealmePartsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fragment fragment = getFragmentManager().findFragmentById(android.R.id.content);
        if (fragment == null) {
            mRealmePartsFragment = new RealmeParts();
            getFragmentManager().beginTransaction()
                    .add(android.R.id.content, mRealmePartsFragment)
                    .commit();
        } else {
            mRealmePartsFragment = (RealmeParts) fragment;
        }
    }
}
