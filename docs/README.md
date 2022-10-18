# CDK8s & CDK8s+ website

## :rocket: Quick start

**1. Build the docs content of the site**

This will…

- install the pip dependencies
- generate the Hugo files and
- copy the [`cdk8s/Roadmap.md`](../ROADMAP.md), [`cdk8s/CONTRIBUTING.md`](../CONTRIBUTING.md) and [`cdk8s/CHANGELOG.md`](../CHANGELOG.md) files into the [`cdk8s/docs`](.) directory for bundling.
- build the docs pages using MkDocs and copy them to the [`cdk8s/website/public/docs/latest`](../website/public/docs/latest) directory to later be bundled with the Hugo site.

```bash
./docs/build.sh
```

**2. Run the MkDocs server to preview the documentation content of the site.**

```bash
mkdocs serve
```

This should start the server at [http://127.0.0.1:8000/](http://127.0.0.1:8000/).

**3. (Optional) Run the Hugo server to preview the landing page of the site.**

You'll need to have [Hugo](https://gohugo.io/getting-started/installing/) installed. Then in a new terminal run:

```bash
cd website && hugo server
```

This should start the server at [http://127.0.0.1:1313/](http://127.0.0.1:1313/).

## 📦 Building the production site

**1. Build the landing page.**

```bash
cd website && ./build.sh
```

**2. Build the MkDocs pages and copy them to Hugo's public directory.**

```bash
./docs/build.sh
```

The site's static files are now available in the `website/public` directory ready for deployment.

## 🏗️ Architecture

The website is built in multiple steps:

- The landing page for [cdk8s.io](https://cdk8s.io) is built using Hugo in the [`cdk8s/website`](../website/) directory.
- The documentation content served under [cdk8s.io/docs/*](https://cdk8s.io/docs) is built using MkDocs in the [`cdk8s/docs`](.) (same location as this README) directory.

## 📖 The /docs content

The content for the documentation is located in the [`cdk8s/docs`](.) directory. The content is written in Markdown and is built using MkDocs. Here are a few pointers to help save you time.

### 📄 Adding/removing/reordering/renaming pages

A `.pages` can be used in each directory to describe the page structure of the site.

This is a feature provided by the [Awesome pages plugin](https://henrywhitaker3.github.io/mkdocs-material-dark-theme/plugins/awesome-pages/) check out their docs for more info.

To hide files, define a `.pages` file in the directory and do not include the file in it's configuration.

> Notice how this file is located in the [`cdk8s/docs`](.) directory but it will not be included in the website build unless we add it to the [`.pages`](./.pages) file.

### 🖼️ Assets and custom CSS

The [`cdk8s/docs/assets`](./assets/) directory is used to store assets that are used in the documentation. For example, images, diagrams, etc. The [`cdk8s/docs/assets/extra.css`](./assets/extra.css) is a file we've defined to apply custom CSS should you need it.

## ➕ Where plugins, features, and global configuration are defined

The [`cdk8s/mkdocs.yaml`](../mkdocs.yml) file is used to define MkDocs configuration. This is where the logo, site name, favicon, theme colors, footer content are all defined. It is also where you can define extension such as supporting multi tab content blocks, table of content settings, and more. You'll also define plugins here such as the search plugin. Check out the [MkDocs config documentation](https://www.mkdocs.org/user-guide/configuration/) for more info.

### 👨‍💻 Development resources

- [MkDocs material theme setup](https://squidfunk.github.io/mkdocs-material/setup/changing-the-colors/) - This is the MkDocs theme we use and is where you'll find APIs that allow you to customize the color theme, fonts, logo, and site search.
- [MkDocs material theme API](https://squidfunk.github.io/mkdocs-material/reference/) - Create Admonitions, Annotations, Buttons, Code blocks, Content tabs, Icons, Images, and more.
- [MkDocs site config docs](https://www.mkdocs.org/user-guide/configuration/) - Lists the global MkDocs configuration options that can be defined in `cdk8s/mkdocs.yaml`.
- [MkDocs plugin docs](https://www.mkdocs.org/dev-guide/plugins/) - Defines the plugin API that can be used to extend MkDocs.
- [Site search plugin docs](https://henrywhitaker3.github.io/mkdocs-material-dark-theme/plugins/search/) - This is the search plugin we use and is where you'll find APIs that allow you to customize the search experience.
- [Awesome pages plugin docs](https://henrywhitaker3.github.io/mkdocs-material-dark-theme/plugins/awesome-pages/) - Used to define the page structure of the site using `.pages` files.
