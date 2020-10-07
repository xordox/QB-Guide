package com.xord.qbguide

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.navigation.NavigationView
import com.xord.qbguide.adapter.CategoriesAdapter
import com.xord.qbguide.db.QbSQLiteOpenHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    var db: SQLiteDatabase? = null
    var cursor: Cursor? = null
    var categoriesAdapter: CategoriesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.app_name, 0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)


        val myNotesDatabaseHelper = QbSQLiteOpenHelper(this)
        db = myNotesDatabaseHelper.readableDatabase

        cursor = db!!.query(
            "note_categories", arrayOf("_id", "image_resource_id", "name"),
            null, null, null, null, null
        )

        var listOfCategories = mutableListOf<Category>()

        while (cursor!!.moveToNext()) {
            val categoryId = cursor!!.getInt(0)
            val categoryResourceId = cursor!!.getInt(1)
            val categoryName = cursor!!.getString(2)

            val category: Category = Category(categoryId, categoryResourceId, categoryName)
            listOfCategories.add(category)
        }
        categoriesAdapter = CategoriesAdapter(this, listOfCategories) { categoryId ->
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NOTE_CATEGORY_ID", categoryId)
            startActivity(intent)
        }

        val categoriesGridLayoutManager = GridLayoutManager(this, 2)

            recyclerViewNoteCategories.adapter = categoriesAdapter
            recyclerViewNoteCategories.layoutManager = categoriesGridLayoutManager

        }
    override fun onDestroy(){
        super.onDestroy()
        db!!.close()
        cursor!!.close()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_profile -> {
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_messages -> {
                Toast.makeText(this, "Messages clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_friends -> {
                Toast.makeText(this, "Friends clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_update -> {
                Toast.makeText(this, "Update clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_logout -> {
                Toast.makeText(this, "Sign out clicked", Toast.LENGTH_SHORT).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}

