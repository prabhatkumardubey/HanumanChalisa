package my.dubeytechnologies.hinduchalisa;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private boolean isChalisaExpanded;
    private boolean isMantraExpanded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_ashtak_mantra, R.id.nav_ganesh_chalisa, R.id.nav_shiv_chalisa, R.id.nav_hanuman_chalisa, R.id.nav_durga_chalisa, R.id.nav_mahamritunjay_mantra, R.id.nav_narsimha_mantra, R.id.nav_madhurashtakam_mantra)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        navigationView.setNavigationItemSelectedListener(item -> handleNavigationSelection(item, navigationView, navController, drawer));
    }

    private boolean handleNavigationSelection(MenuItem item, NavigationView navigationView, NavController navController, DrawerLayout drawerLayout) {
        Menu menu = navigationView.getMenu();
        int itemId = item.getItemId();

        if (itemId == R.id.nav_chalisa_group) {
            isChalisaExpanded = !isChalisaExpanded;
            setChalisaItemsVisibility(menu, isChalisaExpanded);
            return true;
        }

        if (itemId == R.id.nav_mantra_group) {
            isMantraExpanded = !isMantraExpanded;
            setMantraItemsVisibility(menu, isMantraExpanded);
            return true;
        }

        boolean handled = NavigationUI.onNavDestinationSelected(item, navController);
        if (handled) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        return handled;
    }

    private void setChalisaItemsVisibility(Menu menu, boolean isVisible) {
        menu.findItem(R.id.nav_ganesh_chalisa).setVisible(isVisible);
        menu.findItem(R.id.nav_shiv_chalisa).setVisible(isVisible);
        menu.findItem(R.id.nav_hanuman_chalisa).setVisible(isVisible);
        menu.findItem(R.id.nav_durga_chalisa).setVisible(isVisible);
    }

    private void setMantraItemsVisibility(Menu menu, boolean isVisible) {
        menu.findItem(R.id.nav_ashtak_mantra).setVisible(isVisible);
        menu.findItem(R.id.nav_mahamritunjay_mantra).setVisible(isVisible);
        menu.findItem(R.id.nav_narsimha_mantra).setVisible(isVisible);
        menu.findItem(R.id.nav_madhurashtakam_mantra).setVisible(isVisible);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
