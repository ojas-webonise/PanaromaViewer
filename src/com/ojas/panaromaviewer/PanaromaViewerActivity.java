package com.ojas.panaromaviewer;

import android.os.Bundle;
import android.view.Menu;

import com.panoramagl.PLImage;
import com.panoramagl.PLSpherical2Panorama;
import com.panoramagl.PLView;
import com.panoramagl.utils.PLUtils;

public class PanaromaViewerActivity extends PLView {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_panaroma_viewer);
	     PLSpherical2Panorama panorama = new PLSpherical2Panorama();
	     panorama.setImage(new PLImage(PLUtils.getBitmap(this, R.raw.spherical_pano), false));
	     this.setPanorama(panorama);
	     
//	     this.load(new PLJSONLoader("res://raw/json_spherical"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);  
		return true;  
	}

}
