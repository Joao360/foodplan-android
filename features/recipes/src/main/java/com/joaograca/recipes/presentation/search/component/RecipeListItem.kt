package com.joaograca.recipes.presentation.search.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.recipes.R
import com.joaograca.recipes.domain.model.RecipePreview

@Composable
fun RecipeListItem(
    modifier: Modifier,
    recipe: RecipePreview,
    onClick: (Int) -> Unit
) {
    val spacing = LocalSpacing.current

    Column(
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .padding(spacing.spaceExtraSmall)
            .shadow(
                elevation = 2.dp,
                shape = MaterialTheme.shapes.medium
            )
            .background(MaterialTheme.colors.surface)
            .padding(spacing.spaceMedium)
            .clickable { onClick(recipe.id) },
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = recipe.imageUrl,
            contentDescription = recipe.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(MaterialTheme.shapes.small),
            placeholder = painterResource(id = R.drawable.ic_tray_plate),
            error = painterResource(id = R.drawable.ic_error),
        )
        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        Text(
            text = recipe.name,
            style = MaterialTheme.typography.body1,
            maxLines = 2,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    RecipeListItem(
        recipe = RecipePreview(
            id = 1,
            "Lorem ipsum dolor sit amet",
            imageUrl = ""
        ),
        modifier = Modifier.aspectRatio(1f),
        onClick = {}
    )
}