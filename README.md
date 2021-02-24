# JetpackComposePlayground ⚽
Having a taste of the possible future of android ui development.

Jetpack compose is a modern ui toolkit that creates native UI using less code, powerful tools and intuitive Kotlin APIs.

It is meant to replace the use of xml files for layouts..

@Composable  annotated function is used to create UI widgets.
These widgets include images, texts, e.t.c.
@Preview annotated function is used to call composable functions for previewing. Preferrably, they shouldn't contain parameters.
Using a separate method to preview functions boosts the UI performance.

@Column has been used to arrange the UI widgets vertically.
Modifier attributes in column are meant to mimic layout attributes such as layout_height, layout_width, layout_padding, e.t.c.
The modifier attributes configure the layout.

Compose supports material design out of the box, thus it easily integrates with it.
