<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/bgcolor1"
        tools:context=".editdelete">

<com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNavigationView"
        android:layout_width="404dp"
        android:layout_height="63dp"
        android:layout_marginStart="4dp"
        android:layout_marginLeft="4dp"
        android:layout_marginEnd="3dp"
        android:layout_marginRight="3dp"
        android:layout_marginBottom="1dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

<LinearLayout
        android:id="@+id/llbnavigation"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:background="@color/black"
                android:orientation="horizontal">

<ImageButton
          android:id="@+id/imageButton"
                  android:layout_width="wrap_content"
                  android:layout_height="match_parent"
                  android:layout_weight="1"
                  android:background="@color/ibbgcolor"
                  app:srcCompat="@drawable/microsoftteams_image__15_" />

<ImageButton
          android:id="@+id/imageButton2"
                  android:layout_width="wrap_content"
                  android:layout_height="match_parent"
                  android:layout_weight="1"
                  android:background="@color/ibbgcolor"
                  app:srcCompat="@drawable/microsoftteams_image__13_" />

<ImageButton
          android:id="@+id/imageButton6"
                  android:layout_width="wrap_content"
                  android:layout_height="match_parent"
                  android:layout_weight="1"
                  android:background="@color/ibbgcolor"
                  app:srcCompat="@drawable/microsoftteams_image__17_" />

<ImageButton
          android:id="@+id/imageButton7"
                  android:layout_width="wrap_content"
                  android:layout_height="match_parent"
                  android:layout_weight="1"
                  android:background="@color/ibbgcolor"
                  app:srcCompat="@drawable/microsoftteams_image__16_" />

</LinearLayout>
</com.google.android.material.bottomnavigation.BottomNavigationView>

<LinearLayout
      android:id="@+id/llbnavigation1"
              android:layout_width="399dp"
              android:layout_height="66dp"
              android:layout_marginTop="666dp"
              android:layout_marginEnd="12dp"
              android:layout_marginRight="12dp"
              android:background="@color/black"
              android:orientation="horizontal"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toTopOf="parent" />

<FrameLayout
      android:id="@+id/frameLayout2"
              android:layout_width="414dp"
              android:layout_height="140dp"
              android:layout_marginBottom="591dp"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toTopOf="parent"
              app:layout_constraintVertical_bias="0.0">

<TextView
        android:id="@+id/textView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:background="@color/fl2"
                android:gravity="center"
                android:text="TextView"
                android:textColor="@color/black"
                android:textSize="@dimen/tv2topicsize"
                android:textStyle="bold"
                tools:text="@string/tvnamedelete" />
</FrameLayout>

<LinearLayout
      android:id="@+id/linearLayout"
              android:layout_width="341dp"
              android:layout_height="167dp"
              android:layout_marginStart="35dp"
              android:layout_marginLeft="35dp"
              android:layout_marginTop="195dp"
              android:layout_marginEnd="35dp"
              android:layout_marginRight="35dp"
              android:layout_marginBottom="243dp"
              android:orientation="vertical"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintHorizontal_bias="0.0"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toTopOf="parent"
              app:layout_constraintVertical_bias="0.047">

<TextView
        android:id="@+id/textView6"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="TextView"
                android:textColor="@color/tvnamebgcolor5"
                android:textSize="20sp"
                tools:text="@string/tvdelete2" />

<TextView
        android:id="@+id/tvdelete3"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="TextView"
                android:textColor="@color/tvnamebgcolor5"
                android:textSize="20sp"
                tools:text="@string/tvdelete4" />

<TextView
        android:id="@+id/tvdelete5"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="TextView"
                android:textColor="@color/tvnamebgcolor5"
                android:textSize="20sp"
                tools:text="@string/tvdelete5" />

<TextView
        android:id="@+id/tvdelete6"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="TextView"
                android:textColor="@color/tvnamebgcolor5"
                android:textSize="20sp"
                tools:text="@string/tvdelete6" />

</LinearLayout>

<Button
      android:id="@+id/btndelete1"
              android:layout_width="270dp"
              android:layout_height="51dp"
              android:layout_marginTop="48dp"
              android:background="@color/btn2"
              android:text="Button"
              android:textColor="@color/black"
              app:backgroundTint="@color/btn2"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintHorizontal_bias="0.496"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toBottomOf="@+id/linearLayout"
              tools:text="@string/btnnamedelete1" />

<Button
      android:id="@+id/btndelete2"
              android:layout_width="wrap_content"
              android:layout_height="wrap_content"
              android:layout_marginBottom="120dp"
              android:background="@color/btn2"
              android:text="Button"
              android:textColor="@color/black"
              app:backgroundTint="@color/btn2"
              app:layout_constraintBottom_toTopOf="@+id/llbnavigation1"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintHorizontal_bias="0.498"
              app:layout_constraintStart_toStartOf="parent"
              tools:text="@string/btnnamedelete2" />

<Button
      android:id="@+id/btndelete3"
              android:layout_width="268dp"
              android:layout_height="48dp"
              android:background="@color/btn2"
              android:text="Button"
              android:textColor="@color/black"
              app:backgroundTint="@color/btn2"
              app:layout_constraintBottom_toTopOf="@+id/bottomNavigationView"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toBottomOf="@+id/btndelete2"
              app:layout_constraintVertical_bias="0.337"
              tools:text="@string/btnnamedelete3" />

</androidx.constraintlayout.widget.ConstraintLayout>