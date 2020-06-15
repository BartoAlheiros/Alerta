package com.alerta.mobile_ufrpe.alerta.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.alerta.mobile_ufrpe.alerta.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.jetbrains.annotations.Nullable;

public class TempoAgoraActivity extends Fragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;


    private static final LatLng PINA = new LatLng(-8.099,-34.887);
    private static final LatLng PORTO = new LatLng(-8.054, -34.873);
    private static final LatLng APAC = new LatLng(-8.04491, -34.87518);
    private static final LatLng TORREAO = new LatLng(-8.037, -34.884);
    private static final LatLng CAMPINABARRETO = new LatLng(-8.013, -34.881);
    private static final LatLng MORROCONCEICAO = new LatLng(-8.019, -34.915);
    private static final LatLng ALTOMANDU = new LatLng(-8.024, -34.927);
    private static final LatLng ALTOBELAVISTA = new LatLng(-8.123583, -34.941528);
    private static final LatLng IBIRIBEIRA = new LatLng(-8.120975, -34.913983);
    private static final LatLng IBURA = new LatLng(-8.122, -34.955);
    private static final LatLng DOISIRMAOS = new LatLng(-8.018378, -34.947058);
    private static final LatLng CORREGOGENIPAPO = new LatLng(-8.007, -34.936);
    private static final LatLng NOVADESCOBERTA = new LatLng(-8.001917, -34.919278);

    private Marker mPina;
    private Marker mPorto;
    private Marker mAPAC;
    private Marker mTorreao;
    private Marker mCampinaBarreto;
    private Marker mMorroConceicao;
    private Marker mAltoMandu;
    private Marker mAltoBelaVista;
    private Marker mIbiribeira;
    private Marker mIbura;
    private Marker mDoisIrmaos;
    private Marker mCorregoGenipapo;
    private Marker mNovaDescoberta;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_tempo_agora, container, false);

        return view;
    }


    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map_tempo);
        mapFragment.getMapAsync(this);

        getActivity().setTitle("Tempo Agora");

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        mPina = mMap.addMarker(new MarkerOptions()
                .position(PINA)
                        .title("Pina")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro))
                .snippet("Estado: Chovendo"));
        mPina.setTag(0);

        mPorto = mMap.addMarker(new MarkerOptions()
                .position(PORTO)
                .title("Porto")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mPorto.setTag(0);

        mAPAC = mMap.addMarker(new MarkerOptions()
                .position(APAC)
                .title("APAC")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mAPAC.setTag(0);

        mTorreao = mMap.addMarker(new MarkerOptions()
                .position(TORREAO)
                .title("Torreão")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mTorreao.setTag(0);

        mCampinaBarreto= mMap.addMarker(new MarkerOptions()
                .position(CAMPINABARRETO)
                .title("Campina do Barreto")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mCampinaBarreto.setTag(0);

        mMorroConceicao = mMap.addMarker(new MarkerOptions()
                .position(MORROCONCEICAO)
                .title("Morro da Conceição")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mMorroConceicao.setTag(0);

        mAltoMandu = mMap.addMarker(new MarkerOptions()
                .position(ALTOMANDU)
                .title("Alto do Mandu")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mAltoMandu.setTag(0);

        mAltoBelaVista = mMap.addMarker(new MarkerOptions()
                .position(ALTOBELAVISTA)
                .title("Alto Bela Vista")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mAltoBelaVista.setTag(0);

        mIbiribeira = mMap.addMarker(new MarkerOptions()
                .position(IBIRIBEIRA)
                .title("Ibiribeira")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro))
                .snippet("Estado: Chovendo"));
        mIbiribeira.setTag(0);

        mIbura = mMap.addMarker(new MarkerOptions()
                .position(IBURA)
                .title("Ibura")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));;
        mIbura.setTag(0);

        mDoisIrmaos = mMap.addMarker(new MarkerOptions()
                .position(DOISIRMAOS)
                .title("Dois Irmãos")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mDoisIrmaos.setTag(0);

        mCorregoGenipapo = mMap.addMarker(new MarkerOptions()
                .position(CORREGOGENIPAPO)
                .title("Corrego do Genipapo")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro)));
        mCorregoGenipapo.setTag(0);

        mNovaDescoberta = mMap.addMarker(new MarkerOptions()
                .position(NOVADESCOBERTA)
                .title("Nova Descoberta")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pluviometro))
                .snippet("Estado: Chovendo"));
        mNovaDescoberta.setTag(0);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-8.027725,-34.927305), 11));
        mMap.setOnMarkerClickListener(this);

    }

    @Override
    public boolean onMarkerClick(final Marker marker) {
        return false;
    }

}
