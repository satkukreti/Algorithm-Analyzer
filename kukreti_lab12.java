public class kukreti_lab12{
    
    private static int width = 700;
    private static int width2 = 350;
	private static int height = 350;
	
	public static void main(String[] args)
	{
		// create the window and specify the size and what to do when the window is closed
		javax.swing.JFrame f = new javax.swing.JFrame();
		f.setPreferredSize(new java.awt.Dimension(width, height));
		f.setMinimumSize(new java.awt.Dimension(width, height));
		f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		// create the menu bar
		javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
		
		// create the two menus
		javax.swing.JMenu fileMenu = new javax.swing.JMenu("File");
		
		// create the menu items for the two menus
		javax.swing.JMenuItem fileExit = new javax.swing.JMenuItem("Exit");
        javax.swing.JMenuItem fileReadSort = new javax.swing.JMenuItem("Read Sort File");
        javax.swing.JMenuItem fileReadSearch = new javax.swing.JMenuItem("Read Search File");
		
		// add the two menus to the menu bar
        menuBar.add(fileMenu);
		
		// add the two menu items to the two menus
        fileMenu.add(fileReadSort);
        fileMenu.add(fileReadSearch);
        fileMenu.add(fileExit);

			
        //create the panel to hold the buttons
        javax.swing.JPanel leftButtonPanel = new javax.swing.JPanel();
        leftButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255, 255), 2));
        leftButtonPanel.setPreferredSize(new java.awt.Dimension(width2, height));
		leftButtonPanel.setMinimumSize(new java.awt.Dimension(width2, height));
		java.awt.GridBagLayout leftGridBagLayout = new java.awt.GridBagLayout();
		leftButtonPanel.setLayout(leftGridBagLayout);

        javax.swing.JPanel rightButtonPanel = new javax.swing.JPanel();
        rightButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255, 255), 2));
        rightButtonPanel.setPreferredSize(new java.awt.Dimension(width2, height));
		rightButtonPanel.setMinimumSize(new java.awt.Dimension(width2, height));
		java.awt.GridBagLayout rightGridBagLayout = new java.awt.GridBagLayout();
		rightButtonPanel.setLayout(rightGridBagLayout);

        java.awt.GridBagConstraints leftButtonPanelConstraints = new java.awt.GridBagConstraints();
		
        javax.swing.JButton sortIntsButton = new javax.swing.JButton("Sort Ints");
		javax.swing.JLabel sortIntsLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton addBSTButton = new javax.swing.JButton("Add to BST");
		javax.swing.JLabel addBSTLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton addTreesetButton = new javax.swing.JButton("Add to Treeset");
		javax.swing.JLabel addTreesetLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton addPQButton = new javax.swing.JButton("Add to Priority Queue");
		javax.swing.JLabel addPQLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton addHSButton = new javax.swing.JButton("Add to Hashset");
		javax.swing.JLabel addHSLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton addALButton = new javax.swing.JButton("Add to Arraylist");
		javax.swing.JLabel addALLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton addSortedALButton = new javax.swing.JButton("Add to Sorted Arraylist");
		javax.swing.JLabel addSortedALLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton addAButton = new javax.swing.JButton("Add to Array");
		javax.swing.JLabel addALabel = new javax.swing.JLabel("No Result");

        java.awt.GridBagConstraints rightButtonPanelConstraints = new java.awt.GridBagConstraints();

        javax.swing.JButton searchIntsButton = new javax.swing.JButton("Search Sorted Ints");
		javax.swing.JLabel searchIntsLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton searchBSTButton = new javax.swing.JButton("Search BST");
		javax.swing.JLabel searchBSTLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton searchTreesetButton = new javax.swing.JButton("Search Treeset");
		javax.swing.JLabel searchTreesetLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton searchPQButton = new javax.swing.JButton("Search Priority Queue");
		javax.swing.JLabel searchPQLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton searchHSButton = new javax.swing.JButton("Search Hashset");
		javax.swing.JLabel searchHSLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton searchALButton = new javax.swing.JButton("Search Arraylist");
		javax.swing.JLabel searchALLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton searchSortedALButton = new javax.swing.JButton("Search Sorted Arraylist");
		javax.swing.JLabel searchSortedALLabel = new javax.swing.JLabel("No Result");
        javax.swing.JButton searchAButton = new javax.swing.JButton("Search Array");
		javax.swing.JLabel searchALabel = new javax.swing.JLabel("No Result");
        

        leftButtonPanelConstraints.weightx = 1;
        leftButtonPanelConstraints.weighty = 1;
        leftButtonPanelConstraints.fill = java.awt.GridBagConstraints.NONE;
        leftButtonPanelConstraints.anchor = java.awt.GridBagConstraints.LINE_START;

        leftButtonPanelConstraints.gridx = 0;
        leftButtonPanelConstraints.gridy = 0;
        leftButtonPanelConstraints.gridwidth = 1;
        leftGridBagLayout.setConstraints(sortIntsButton, leftButtonPanelConstraints);

        leftButtonPanelConstraints.gridx = 1;
        leftButtonPanelConstraints.gridy = 0;
        leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        leftGridBagLayout.setConstraints(sortIntsLabel, leftButtonPanelConstraints);

        leftButtonPanel.add(sortIntsButton);
        leftButtonPanel.add(sortIntsLabel);

        //next button

        leftButtonPanelConstraints.gridx = 0;
        leftButtonPanelConstraints.gridy = 1;
        leftButtonPanelConstraints.gridwidth = 1;
        leftGridBagLayout.setConstraints(addBSTButton, leftButtonPanelConstraints);

        leftButtonPanelConstraints.gridx = 1;
        leftButtonPanelConstraints.gridy = 1;
        leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        leftGridBagLayout.setConstraints(addBSTLabel, leftButtonPanelConstraints);

        leftButtonPanel.add(addBSTButton);
        leftButtonPanel.add(addBSTLabel);

        //next button

        leftButtonPanelConstraints.gridx = 0;
        leftButtonPanelConstraints.gridy = 2;
        leftButtonPanelConstraints.gridwidth = 1;
        leftGridBagLayout.setConstraints(addTreesetButton, leftButtonPanelConstraints);

        leftButtonPanelConstraints.gridx = 1;
        leftButtonPanelConstraints.gridy = 2;
        leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        leftGridBagLayout.setConstraints(addTreesetLabel, leftButtonPanelConstraints);

        leftButtonPanel.add(addTreesetButton);
        leftButtonPanel.add(addTreesetLabel);  
        
        //next button

        leftButtonPanelConstraints.gridx = 0;
        leftButtonPanelConstraints.gridy = 3;
        leftButtonPanelConstraints.gridwidth = 1;
        leftGridBagLayout.setConstraints(addPQButton, leftButtonPanelConstraints);

        leftButtonPanelConstraints.gridx = 1;
        leftButtonPanelConstraints.gridy = 3;
        leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        leftGridBagLayout.setConstraints(addPQLabel, leftButtonPanelConstraints);

        leftButtonPanel.add(addPQButton);
        leftButtonPanel.add(addPQLabel);  

        //next button

        leftButtonPanelConstraints.gridx = 0;
        leftButtonPanelConstraints.gridy = 4;
        leftButtonPanelConstraints.gridwidth = 1;
        leftGridBagLayout.setConstraints(addHSButton, leftButtonPanelConstraints);

        leftButtonPanelConstraints.gridx = 1;
        leftButtonPanelConstraints.gridy = 4;
        leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        leftGridBagLayout.setConstraints(addHSLabel, leftButtonPanelConstraints);

        leftButtonPanel.add(addHSButton);
        leftButtonPanel.add(addHSLabel);  

        //next button

        leftButtonPanelConstraints.gridx = 0;
        leftButtonPanelConstraints.gridy = 5;
        leftButtonPanelConstraints.gridwidth = 1;
        leftGridBagLayout.setConstraints(addALButton, leftButtonPanelConstraints);

        leftButtonPanelConstraints.gridx = 1;
        leftButtonPanelConstraints.gridy = 5;
        leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        leftGridBagLayout.setConstraints(addALLabel, leftButtonPanelConstraints);

        leftButtonPanel.add(addALButton);
        leftButtonPanel.add(addALLabel);
        
        //next button

        leftButtonPanelConstraints.gridx = 0;
        leftButtonPanelConstraints.gridy = 6;
        leftButtonPanelConstraints.gridwidth = 1;
        leftGridBagLayout.setConstraints(addSortedALButton, leftButtonPanelConstraints);

        leftButtonPanelConstraints.gridx = 1;
        leftButtonPanelConstraints.gridy = 6;
        leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        leftGridBagLayout.setConstraints(addSortedALLabel, leftButtonPanelConstraints);

        leftButtonPanel.add(addSortedALButton);
        leftButtonPanel.add(addSortedALLabel);  

        //next button

        leftButtonPanelConstraints.gridx = 0;
        leftButtonPanelConstraints.gridy = 7;
        leftButtonPanelConstraints.gridwidth = 1;
        leftGridBagLayout.setConstraints(addAButton, leftButtonPanelConstraints);

        leftButtonPanelConstraints.gridx = 1;
        leftButtonPanelConstraints.gridy = 7;
        leftButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        leftGridBagLayout.setConstraints(addALabel, leftButtonPanelConstraints);

        leftButtonPanel.add(addAButton);
        leftButtonPanel.add(addALabel);  

        //right panel

        rightButtonPanelConstraints.weightx = 1;
        rightButtonPanelConstraints.weighty = 1;
        rightButtonPanelConstraints.fill = java.awt.GridBagConstraints.NONE;
        rightButtonPanelConstraints.anchor = java.awt.GridBagConstraints.LINE_START;

        rightButtonPanelConstraints.gridx = 0;
        rightButtonPanelConstraints.gridy = 0;
        rightButtonPanelConstraints.gridwidth = 1;
        rightGridBagLayout.setConstraints(searchIntsButton, rightButtonPanelConstraints);

        rightButtonPanelConstraints.gridx = 1;
        rightButtonPanelConstraints.gridy = 0;
        rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        rightGridBagLayout.setConstraints(searchIntsLabel, rightButtonPanelConstraints);

        rightButtonPanel.add(searchIntsButton);
        rightButtonPanel.add(searchIntsLabel);

        //next button

        rightButtonPanelConstraints.gridx = 0;
        rightButtonPanelConstraints.gridy = 1;
        rightButtonPanelConstraints.gridwidth = 1;
        rightGridBagLayout.setConstraints(searchBSTButton, rightButtonPanelConstraints);

        rightButtonPanelConstraints.gridx = 1;
        rightButtonPanelConstraints.gridy = 1;
        rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        rightGridBagLayout.setConstraints(searchBSTLabel, rightButtonPanelConstraints);

        rightButtonPanel.add(searchBSTButton);
        rightButtonPanel.add(searchBSTLabel);

        //next button

        rightButtonPanelConstraints.gridx = 0;
        rightButtonPanelConstraints.gridy = 2;
        rightButtonPanelConstraints.gridwidth = 1;
        rightGridBagLayout.setConstraints(searchTreesetButton, rightButtonPanelConstraints);

        rightButtonPanelConstraints.gridx = 1;
        rightButtonPanelConstraints.gridy = 2;
        rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        rightGridBagLayout.setConstraints(searchTreesetLabel, rightButtonPanelConstraints);

        rightButtonPanel.add(searchTreesetButton);
        rightButtonPanel.add(searchTreesetLabel);

        //next button

        rightButtonPanelConstraints.gridx = 0;
        rightButtonPanelConstraints.gridy = 3;
        rightButtonPanelConstraints.gridwidth = 1;
        rightGridBagLayout.setConstraints(searchPQButton, rightButtonPanelConstraints);

        rightButtonPanelConstraints.gridx = 1;
        rightButtonPanelConstraints.gridy = 3;
        rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        rightGridBagLayout.setConstraints(searchPQLabel, rightButtonPanelConstraints);

        rightButtonPanel.add(searchPQButton);
        rightButtonPanel.add(searchPQLabel);

        //next button

        rightButtonPanelConstraints.gridx = 0;
        rightButtonPanelConstraints.gridy = 4;
        rightButtonPanelConstraints.gridwidth = 1;
        rightGridBagLayout.setConstraints(searchHSButton, rightButtonPanelConstraints);

        rightButtonPanelConstraints.gridx = 1;
        rightButtonPanelConstraints.gridy = 4;
        rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        rightGridBagLayout.setConstraints(searchHSLabel, rightButtonPanelConstraints);

        rightButtonPanel.add(searchHSButton);
        rightButtonPanel.add(searchHSLabel);

        //next button

        rightButtonPanelConstraints.gridx = 0;
        rightButtonPanelConstraints.gridy = 5;
        rightButtonPanelConstraints.gridwidth = 1;
        rightGridBagLayout.setConstraints(searchALButton, rightButtonPanelConstraints);

        rightButtonPanelConstraints.gridx = 1;
        rightButtonPanelConstraints.gridy = 5;
        rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        rightGridBagLayout.setConstraints(searchALLabel, rightButtonPanelConstraints);

        rightButtonPanel.add(searchALButton);
        rightButtonPanel.add(searchALLabel);

        //next button

        rightButtonPanelConstraints.gridx = 0;
        rightButtonPanelConstraints.gridy = 6;
        rightButtonPanelConstraints.gridwidth = 1;
        rightGridBagLayout.setConstraints(searchSortedALButton, rightButtonPanelConstraints);

        rightButtonPanelConstraints.gridx = 1;
        rightButtonPanelConstraints.gridy = 6;
        rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        rightGridBagLayout.setConstraints(searchSortedALLabel, rightButtonPanelConstraints);

        rightButtonPanel.add(searchSortedALButton);
        rightButtonPanel.add(searchSortedALLabel);

        //next button

        rightButtonPanelConstraints.gridx = 0;
        rightButtonPanelConstraints.gridy = 7;
        rightButtonPanelConstraints.gridwidth = 1;
        rightGridBagLayout.setConstraints(searchAButton, rightButtonPanelConstraints);

        rightButtonPanelConstraints.gridx = 1;
        rightButtonPanelConstraints.gridy = 7;
        rightButtonPanelConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        rightGridBagLayout.setConstraints(searchALabel, rightButtonPanelConstraints);

        rightButtonPanel.add(searchAButton);
        rightButtonPanel.add(searchALabel);


        javax.swing.JPanel mainButtonPanel = new javax.swing.JPanel();
        mainButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0, 255), 2));
        javax.swing.BoxLayout boxLayout = new javax.swing.BoxLayout(mainButtonPanel, javax.swing.BoxLayout.X_AXIS);
        mainButtonPanel.setLayout(boxLayout);
        mainButtonPanel.add(leftButtonPanel);
        mainButtonPanel.add(rightButtonPanel);
		
		// create the panel
		javax.swing.JPanel mainPanel = new javax.swing.JPanel();
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0, 255), 2));
		mainPanel.setLayout(new java.awt.BorderLayout());
		mainPanel.add(menuBar, java.awt.BorderLayout.NORTH);
		mainPanel.add(mainButtonPanel, java.awt.BorderLayout.CENTER);
		
		// create the action listeners for the menu items
		MenuItemActionListener fileExitMenuItemActionListener = new MenuItemActionListener(fileExit);
		MenuItemActionListener fileReadSortMenuItemActionListener = new MenuItemActionListener(fileReadSort);
        MenuItemActionListener fileReadSearchMenuItemActionListener = new MenuItemActionListener(fileReadSearch);

		// add the action listeners to the menu items
		fileExit.addActionListener(fileExitMenuItemActionListener);
        fileReadSort.addActionListener(fileReadSortMenuItemActionListener);
        fileReadSearch.addActionListener(fileReadSearchMenuItemActionListener);
	
		f.setContentPane(mainPanel);
		
		f.validate();
		f.setVisible(true);
	}
	
	// action listener for the buttons
	static class ButtonActionListener implements java.awt.event.ActionListener
	{
		// the button associated with the action listener, so that we can
		// share this one class with multiple buttons
		private javax.swing.JButton b;
		
		ButtonActionListener(javax.swing.JButton b)
		{
			this.b = b;
		}
		
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			System.out.println("action performed on " + b.getText() + " button");
		}
	}
	
	// action listener for the menu items
	static class MenuItemActionListener implements java.awt.event.ActionListener
	{
		// the menu item associated with the action listener, so that we can
		// share this one class with multiple menu items
		private javax.swing.JMenuItem m;
		
		MenuItemActionListener(javax.swing.JMenuItem m)
		{
			this.m = m;
		}
		
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			System.out.println("action performed on " + m.getText() + " menu item");
			
			// if exit is selected from the file menu, exit the program
			if( m.getText().toLowerCase().equals("exit") )
			{
				System.exit(0);
			}

            if( m.getText().toLowerCase().equals("read sort file") )
			{
				System.out.println("Read Sort File");
			}

            if( m.getText().toLowerCase().equals("read search file") )
			{
				System.out.println("Read Search File");
			}
			
		}
	}
}